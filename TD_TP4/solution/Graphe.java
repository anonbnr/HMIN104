import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Graphe implements Cloneable{
	/*attributes*/
	private ArrayList<Sommet> sommets;
	private ArrayList<Arete> aretes;
	private Deque<Spilled> spilled = new ArrayDeque<Spilled>();

	/*constructors*/
	public Graphe(){
		sommets = new ArrayList<Sommet>();
		aretes = new ArrayList<Arete>();
	}

	public Graphe(ArrayList<Sommet> sommets){
		this.sommets = sommets;
		aretes = new ArrayList<Arete>();
	}

	public Graphe(ArrayList<Sommet> sommets, ArrayList<Arete> aretes){
		this.sommets = sommets;
		this.aretes = aretes;
	}

	/*methods*/
	//getters
	public ArrayList<Sommet> getSommets(){return sommets;}
	public ArrayList<Arete> getAretes(){return aretes;}

	//toString
	@Override
	public String toString(){
		return "Sommets : " + this.sommets.toString() +
				"\nArêtes : " + this.aretes.toString() +
				"\nSpillés : " + this.spilled.toString();
	}

	//clone
	@Override
	public Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();
		Graphe clonedGraphe = (Graphe)obj;

		clonedGraphe.sommets = new ArrayList<Sommet>();
		clonedGraphe.sommets.addAll(this.sommets);

		clonedGraphe.aretes = new ArrayList<Arete>();
		clonedGraphe.aretes.addAll(this.aretes);

		clonedGraphe.spilled = new ArrayDeque<Spilled>();
		clonedGraphe.spilled.addAll(this.spilled);

		return clonedGraphe;
	}

	//other methods
	/**
	 * L'ordre du graphe ou le nombre de ses sommets
	 * @return le nombre de sommets du graphe
	 */
	public int ordre() {
		return this.sommets.size();
	}

	/**
	 * La taille du graphe ou le nombre de ses arêtes
	 * @return le nombre des arêtes du graphe
	 */
	public int taille(){
		return this.aretes.size();
	}

	/**
	 * vérifie si sommet est un sommet du graphe
	 * @param sommet le sommet à tester
	 * @return true si sommet est bien un sommet du graphe,
	 * false sinon
	 */
	public boolean isSommet(Sommet sommet) {
		return this.sommets.contains(sommet);
	}

	/**
	 * vérifie si arete est une arête du graphe
	 * @param arete l'arête à tester
	 * @return true si arete est bien une arête du graphe,
	 * false sinon
	 */
	public boolean isArete(Arete arete) {
		return this.aretes.contains(arete);
	}

	/**
	 * vérifie si sommet est un sommet du graphe,
	 * spillé lors du coloriage du graphe
	 * @param sommet le sommet à tester
	 * @return true si sommet a bien spillé,
	 * false sinon
	 */
	public boolean isSpilled(Sommet sommet) {
		for (Spilled s : this.spilled)
			if(s.getSommet().equals(sommet))
				return true;
		return false;
	}

	/**
	 * supprime un sommet du graphe
	 * @param sommet le sommet à supprimer
	 * @throws SommetNotFoundException levée si sommet n'est pas un sommet
	 * du graphe
	 */
	public void supprimerSommet(Sommet sommet)
			throws SommetNotFoundException{
		if(!this.isSommet(sommet))
			throw new SommetNotFoundException("Erreur : le sommet "
					+ sommet + " n'est pas un sommet du graphe");
		else
			this.sommets.remove(sommet);
	}

	/**
	 * supprime une arête du graphe
	 * @param arete l'arête à supprimer
	 * @throws AreteNotFoundException levée si arete n'est pas une arête
	 * du graphe
	 */
	public void supprimerArete(Arete arete)
			throws AreteNotFoundException{
		if(!this.isArete(arete))
			throw new AreteNotFoundException("Erreur : l'arête "
					+ arete + " n'est pas une arête du graphe");
		else
			this.aretes.remove(arete);
	}

	/**
	 * empile le sommet "sommet" sur la pile des sommets "spillés"
	 * @param sommet le sommet qui a spillé
	 */
	private void empileSpilled(Sommet sommet){
		this.spilled.push(new Spilled(sommet));
	}

	/**
	 * dépile le dernier sommet spillé du graphe et le renvoie
	 * @param sommet le dernier sommet spillé à dépiler
	 * @return le sommet spillé dépilé
	 */
	public Spilled depileSpilled(){
		return this.spilled.pop();
	}

	/**
	 * Renvoie le degré d'un sommet du graphe. Autrement dit, renvoie
	 * le nombre d'arêtes le reliant à d'autres sommets
	 * @param sommet le sommet dont le degré on souhaite calculer
	 * @return le degré du sommet "sommet", -1 si le sommet n'est pas un sommet du graphe
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 */
	public int degre(Sommet sommet)
			throws SommetNotFoundException{
		if (!this.isSommet(sommet))
			throw new SommetNotFoundException("Erreur : le sommet "
					+ sommet + " n'est pas un sommet du graphe");

		int deg = 0;
		for (Arete arete : aretes){
			if (arete.isIncidente(sommet))
				deg++;
		}

		return deg;
	}

	/**
	 * renvoie le minimum des degrés de tous les sommets du graphe
	 * @return le degré minimum parmis tous les degrés de tous les sommets
	 * du graphe.
	 */
	private int minDegre() {
		return Collections.min(
				sommets
				.stream()
				.map(s -> {
					try {
						return this.degre(s);
					} catch (SommetNotFoundException e) {
						e.printStackTrace();
					}
					return null;
				})
				.collect(Collectors.toList()));
	}

	/**
	 * renvoie le maximum des degrés de tous les sommets du graphe
	 * @return le degré maximum parmis tous les degrés de tous les sommets
	 * du graphe.
	 */
	private int maxDegre() {
		return Collections.max(
				sommets
				.stream()
				.map(s -> {
					try {
						return this.degre(s);
					} catch (SommetNotFoundException e) {
						e.printStackTrace();
					}
					return null;
				})
				.collect(Collectors.toList()));
	}

	/**
	 * trier les sommets du graphe par ordre croissant sur leurs couleurs
	 */
	public void trierSommetsParCouleur() {
		Collections.sort(this.sommets, new ComparatorSommetParCouleur());
	}

	/**
	 * trier les sommets passé en paramètre par ordre croissant sur leurs couleurs
	 * @param sommets les sommets à trier
	 */
	public void trierSommetsParCouleur(ArrayList<Sommet> sommets) {
		Collections.sort(sommets, new ComparatorSommetParCouleur());
	}

	/**
	 * Les voisins du sommet, ou l'ensemble des sommets qui y sont reliés par
	 * une arête
	 * @param sommet le sommet à tester
	 * @return l'ensemble des sommets reliés au sommet "sommet" par une arête
	 */
	public ArrayList<Sommet> voisins(Sommet sommet){
		ArrayList<Sommet> voisins = new ArrayList<>();
		for (Arete arete : this.aretes) {
			if (arete.getFirst().equals(sommet))
				voisins.add(arete.getSecond());
			else if(arete.getSecond().equals(sommet))
				voisins.add(arete.getFirst());
		}

		this.trierSommetsParCouleur(voisins);
		return voisins;
	}

	/**
	 * renvoie la liste des sommets dans un graphe auxquels l'arête arete est incidente
	 * @param l'arete du graphe à tester
	 * @return si arete est une ârete du graphe renvoie
	 * la liste des sommets auxquels arete est incidente,
	 * @throws AreteNotFoundException si l'arête n'est pas une arête du graphe
	 * sinon renvoie null
	 */
	public ArrayList<Sommet> sommetsIncidents(Arete arete)
			throws AreteNotFoundException{
		ArrayList<Sommet> sommetsIncidents = new ArrayList<>();
		if (!this.isArete(arete))
			throw new AreteNotFoundException("Erreur : l'arête "
					+ arete + " n'est pas une arête du graphe");

		for (Sommet sommet : this.sommets)
			if(arete.isIncidente(sommet))
				sommetsIncidents.add(sommet);
		return sommetsIncidents;
	}

	/**
	 * renvoie la liste des arêtes incidentes au sommet sommet
	 * @param sommet le sommet dont les arêtes incidentes on souhaite récupérer
	 * @return la liste des arêtes incidentes à sommet
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 */
	private ArrayList<Arete> aretesIncidentes(Sommet sommet)
			throws SommetNotFoundException{
		if (!this.isSommet(sommet))
			throw new SommetNotFoundException("Erreur : le sommet "
					+ sommet + " n'est pas un sommet du graphe");
		ArrayList<Arete> incidentes = new ArrayList<>();
		for (Arete arete : this.aretes)
			if(arete.isIncidente(sommet))
				incidentes.add(arete);
		return incidentes;
	}

	/**
	 * supprime les arêtes incidentes au sommet "sommet" dans le graphe
	 * @param sommet le sommet dont les arêtes incidentes sont à supprimer
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 */
	private void supprimerAretesIncidentes(Sommet sommet)
			throws SommetNotFoundException{
		if (!this.isSommet(sommet))
			throw new SommetNotFoundException("Erreur : le sommet "
					+ sommet + " n'est pas un sommet du graphe");

		ListIterator<Arete> iter = aretes.listIterator();
		while(iter.hasNext()){
			if (iter.next().isIncidente(sommet))
				iter.remove();
		}
	}

	/**
	 * Un sommet est trivialement colorable ssi il est un sommet du graphe et
	 * son degré est inférieur à une constante k désignant le nombre de couleurs
	 * utilisées pour colorier le graphe
	 * @param sommet le sommet à tester
	 * @param k le nombre de couleurs utilisées pour colorier le graphe
	 * @return true si "sommet" est trivialement colorable, false sinon
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 * @throws InvalidColorException si le nombre de couleurs à tester est négatif ou nul
	 */
	public boolean estTrivialColorable(Sommet sommet, int k)
			throws SommetNotFoundException,
			InvalidColorException{
		if (k <= 0)
			throw new InvalidColorException("Erreur : " + k
					+ " n'est pas un nombre de couleurs valide");

		if (this.isSommet(sommet) && this.degre(sommet) < k &&
				!sommet.isColored() && this.degre(sommet) == this.minDegre())
			return true;
		return false;
	}

	/**
	 * renvoie le premier sommet du graphe trivialement colorable par k s'il en existe un
	 * @param k le nombre de couleurs utilisées pour colorier le graphe
	 * @return le premier sommet du graphe trivialement colorable par k s'il en existe un,
	 * sinon renvoie null
	 * @throws SommetNotFoundException cf. estTrivialColorable
	 * @throws InvalidColorException si le nombre de couleurs à tester est négatif ou nul
	 */
	public Sommet trivialColorable(int k)
			throws InvalidColorException,
			SommetNotFoundException{
		for (Sommet sommet : this.sommets)
			if(estTrivialColorable(sommet, k))
				return sommet;
		return null;
	}

	/**
	 * renvoie le premier sommet du graphe qui a spillé
	 * On choisit en utilisant l'heuristique maxDegré sur
	 * les sommets du graphe
	 * @return le sommet qui a spillé ou null si aucun sommet n'a spillé
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 */
	public Sommet spilled()
			throws SommetNotFoundException {
		for (Sommet sommet : this.sommets)
			if(this.degre(sommet) == this.maxDegre())
				return sommet;
		return null;
	}

	/**
	 * attribut une couleur k à un sommet du graphe et extrémité des arêtes "incidentes"
	 * @param sommet le sommet auquel on souhaite attribuer une couleur
	 * @param incidentes les arêtes incidentes à sommet
	 * @param k la couleur à attribuer au sommet
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 * @throws GrapheColorException
	 * si k est négative ou nulle InvalidColorException est levée,
	 * sinon si le graphe est non colorable par k couleurs, NotColorableException
	 * sera levée
	 */
	private void attribueCouleur(Sommet sommet, ArrayList<Arete> incidentes, int k)
			throws SommetNotFoundException,
			GrapheColorException{
		if (!this.isSommet(sommet))
			throw new SommetNotFoundException("Erreur : le sommet"
					+ sommet + " n'est pas un sommet du graphe");

		if (k <= 0)
			throw new InvalidColorException("Erreur : " + k
					+ " n'est pas un nombre de couleurs valide");

		if (sommet.isColored())
			return;

		if (!this.isSpilled(sommet))
			this.aretes.addAll(this.colorerAretesIncidentesSaufSommet(incidentes, sommet));

		if (this.voisins(sommet).size() == 0)
			sommet.setCouleur(1);
		else {
			int couleur;
			for (Sommet voisin : this.voisins(sommet)) {
				if (!sommet.isColored())
					couleur = 1;
				else
					couleur = sommet.getCouleur();
				while(couleur <= k && couleur == voisin.getCouleur())
					couleur++;
				if (couleur > k) {
					if (this.isSpilled(sommet)) {
						sommet.setCouleur(Sommet.COULEUR_DEFAUT);
						System.err.println("Erreur : le sommet " + sommet + " spillé n'est pas "
								+ "coloriable avec " + k + " couleurs en coloriage optimiste");
						break;
					}
					else
						throw new NotColorableException("Erreur : le graphe n'est pas " + k + "-coloriable");
				}
				else
					sommet.setCouleur(couleur);
			}
			this.aretes = this.colorerAretesIncidentesSommet(this.aretes, sommet);
		}
	}

	/**
	 * colorie le graphe avec k couleurs en essayant de colorier les sommets spillés
	 * @param k le nombre de couleurs avec lesquelles on souhaite colorier le graphe
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 * @throws GrapheColorException
	 * si k est négative ou nulle NegativeOrNullColorException est levée,
	 * sinon si le graphe est non colorable par k couleurs, NotColorableException
	 * sera levée
	 * @throws CloneNotSupportedException
	 */
	public Graphe colorierOptimiste(int k) throws SommetNotFoundException,
	GrapheColorException,
	CloneNotSupportedException {
		Graphe graphe = this.colorier(k);
		graphe.colorierSpilled(k);
		return graphe;
	}

	/**
	 * colorie le graphe avec k couleurs
	 * @param k le nombre de couleurs avec lesquelles on souhaite colorier le graphe
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 * @throws GrapheColorException
	 * si k est négative ou nulle NegativeOrNullColorException est levée,
	 * sinon si le graphe est non colorable par k couleurs, NotColorableException
	 * sera levée
	 * @throws CloneNotSupportedException
	 */
	private Graphe colorier(int k)
			throws SommetNotFoundException,
			GrapheColorException,
			CloneNotSupportedException{
		if (k <= 0)
			throw new InvalidColorException("Erreur : " + k
					+ " n'est pas un nombre de couleurs valide");

		if(this.ordre() == 1) {
			this.attribueCouleur(this.sommets.get(0), null, k);
			return this;
		}

		Graphe graphe = (Graphe)this.clone();
		Sommet sommet = this.trivialColorable(k);
		if (sommet != null){
			graphe.supprimerAretesIncidentes(sommet);
			graphe.supprimerSommet(sommet);

			graphe = graphe.colorier(k);

			if(!graphe.isSommet(sommet))
				graphe.sommets.add(sommet);

			ArrayList<Arete> incidentes = this.aretesIncidentes(sommet);
			graphe.attribueCouleur(sommet, incidentes, k);
		}
		else {
			sommet = this.spilled();
			graphe.empileSpilled(sommet);
			graphe.supprimerAretesIncidentes(sommet);
			graphe.supprimerSommet(sommet);

			graphe = graphe.colorier(k);

			ArrayList<Arete> incidentes = this.aretesIncidentes(sommet);
			graphe.spilled.peek().getAretes().addAll(
					graphe.colorerAretesIncidentesSaufSommet(incidentes, sommet));

		}
		return graphe;
	}

	/**
	 * essaye de colorier les sommets spillés une fois les autres sommets
	 * sont colorés (coloriage optimiste)
	 * @param k le nombre de couleurs possibles
	 * @throws SommetNotFoundException si le sommet n'est pas un sommet du graphe
	 * @throws GrapheColorException
	 * si k est négative ou nulle NegativeOrNullColorException est levée,
	 * sinon si le graphe est non colorable par k couleurs, NotColorableException
	 * sera levée
	 */
	private void colorierSpilled(int k)
			throws SommetNotFoundException,
			GrapheColorException {
		for (Spilled s : this.spilled) {
			this.sommets.add(s.getSommet());
			this.aretes.addAll(s.getAretes());
		}

		for (Spilled s : this.spilled)
			this.attribueCouleur(s.getSommet(), s.getAretes(), k);
		int i = this.spilled.size();
		while (i > 0) {
			this.spilled.pop();
			i--;
		}
	}

	/**
	 * colorer les sommets des arêtes ayant chacun la même valeur que sommet
	 * avec la couleur de sommet et les renvoyer
	 * @param aretes les arêtes dont les sommets sont à colorer
	 * @param sommet le sommet dont la couleur est choisie pour colorer les sommets
	 * des arêtes
	 * @return l'ensemble des arêtes dont les sommets sont colorés par la couleur de sommet
	 */
	private ArrayList<Arete> colorerAretesIncidentesSommet(ArrayList<Arete> aretes, Sommet sommet){
		ArrayList<Arete> colores = new ArrayList<>();
		for (Arete arete : aretes) {
			if(arete.getFirst().getValeur().equals(sommet.getValeur()))
				colores.add(new Arete(
						new Sommet(
								sommet.getValeur(), sommet.getCouleur()),
								arete.getSecond()));
			else if (arete.getSecond().getValeur().equals(sommet.getValeur()))
				colores.add(new Arete(
						arete.getFirst(),
						new Sommet(sommet.getValeur(), sommet.getCouleur())));
			else if(arete.isColored())
				colores.add(arete);
		}

		return colores;
	}

	/**
	 * colorer les sommets de toutes les arêtes incidentes à tous les sommets colorés
	 * et les renvoyer
	 * @param aretes les arêtes dont les sommets sont à colorer
	 * @return l'ensemble des arêtes dont les sommets sont colorés
	 */
	private ArrayList<Arete> colorerAretesIncidentes(ArrayList<Arete> aretes){
		ArrayList<Arete> in = new ArrayList<>();

		for (Sommet vertex : this.sommets)
			in.addAll(this.colorerAretesIncidentesSommet(aretes, vertex));

		return in;
	}

	/**
	 * colorer les sommets des arêtes incidentes à tous les sommets sauf sommet
	 * et les renvoyer
	 * @param aretes les arêtes incidentes à tous les sommets sauf sommet
	 * et dont les sommets sont à colorer
	 * @param sommet le sommet à ne pas considérer lors du coloriage
	 * @return les arêtes incidentes à tous les sommets sauf sommet
	 * dont les sommets sont colorés
	 */
	private ArrayList<Arete> colorerAretesIncidentesSaufSommet(ArrayList<Arete> aretes, Sommet sommet) {
		ArrayList<Arete> in = new ArrayList<>();

		for (Sommet vertex : this.sommets)
			if (!vertex.equals(sommet))
				in.addAll(this.colorerAretesIncidentesSommet(aretes, vertex));

		return in;
	}
}
