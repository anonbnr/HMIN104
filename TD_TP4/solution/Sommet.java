package tp4;

public class Sommet implements Cloneable{
	/*attributes*/
	private String valeur;
	private int couleur;
	public static final int COULEUR_DEFAUT = 0;

	/*constructors*/
	public Sommet(String valeur){
		this.valeur = valeur;
		couleur = COULEUR_DEFAUT;
	}

	public Sommet(String valeur, int couleur){
		this.valeur = valeur;
		this.couleur = couleur;
	}

	/*methods*/
	//getters & setters
	public String getValeur(){return this.valeur;}
	public int getCouleur(){return this.couleur;}
	public void setValeur(String valeur){this.valeur = valeur;}
	public void setCouleur(int couleur){
		if (couleur > COULEUR_DEFAUT)
			this.couleur = couleur;
		else
			this.couleur = COULEUR_DEFAUT;
	}

	//toString
	@Override
	public String toString(){
		return "(" + valeur + ", " + couleur + ")";
	}

	//equals
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;

		if(getClass() != obj.getClass())
			return false;

		Sommet sommet = (Sommet)obj;
		return this.valeur.equals(sommet.valeur) && this.couleur == sommet.couleur;
	}
	
	//clone
	@Override
	public Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();
		Sommet clonedSommet = (Sommet)obj;
		clonedSommet.couleur = this.couleur;
		clonedSommet.valeur = this.valeur;
		return clonedSommet;
	}
	
	//other methods
	/**
	 * teste si un sommet est colorié
	 * @return true si le sommet est déjà colorié (n'a pas la couleur par défaut), false sinon
	 */
	public boolean isColored(){
		return this.couleur != COULEUR_DEFAUT;
	}
}
