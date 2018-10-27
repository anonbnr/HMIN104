import java.util.ArrayList;

public class Spilled implements Cloneable{
	/*attributes*/
	private Sommet sommet;
	private ArrayList<Arete> aretes;

	/*constructors*/
	public Spilled(Sommet sommet) {
		this.sommet = sommet;
		this.aretes = new ArrayList<>();
	}

	public Spilled(Sommet sommet, ArrayList<Arete> aretes) {
		this.sommet = sommet;
		this.aretes = aretes;
	}

	/*methods*/
	//getters & setters
	public Sommet getSommet() {
		return this.sommet;
	}

	public void setSommet(Sommet sommet) {
		this.sommet = sommet;
	}

	public ArrayList<Arete> getAretes() {
		return this.aretes;
	}

	public void setAretes(ArrayList<Arete> aretes) {
		this.aretes = aretes;
	}

	//toString
	@Override
	public String toString() {
		return "{" + this.sommet + ", " + this.aretes + "}";
	}

	//clone
	@Override
	public Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();
		Spilled clonedSpilled = (Spilled)obj;
		clonedSpilled.sommet = (Sommet)this.sommet.clone();
		clonedSpilled.aretes = new ArrayList<>();
		clonedSpilled.aretes.addAll(this.aretes);

		return clonedSpilled;
	}
}
