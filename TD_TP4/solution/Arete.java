package tp4;

public class Arete implements Cloneable{
	/*attributes*/
	private Sommet first, second;

	/*constructors*/
	public Arete(Sommet first, Sommet second){
		this.first = first;
		this.second = second;
	}

	/*methods*/
	//getters & setters
	public Sommet getFirst(){return this.first;}
	public Sommet getSecond(){return this.second;}
	public void setFirst(Sommet first){this.first = first;}
	public void setSecond(Sommet second){this.second = second;}

	//toString
	@Override
	public String toString(){
		return "(" + this.first + ", " + this.second + ")";
	}
	
	//clone
	@Override
	public Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();
		Arete clonedArete = (Arete)obj;
		clonedArete.first = (Sommet)this.first.clone();
		clonedArete.second = (Sommet)this.second.clone();
		return clonedArete;
	}

	//other methods
	/**
	 * test si l'arête courante est incidente au sommet "sommet"
	 * @param sommet le sommet à tester
	 * @return true si l'arête est incidente à "sommet", false sinon
	 */
	public boolean isIncidente(Sommet sommet){
		return this.first.equals(sommet) || this.second.equals(sommet);
	}
	
	public boolean isColored() {
		return this.first.isColored() && this.second.isColored();
	}
}
