package tp4;

import java.util.Comparator;

public class ComparatorSommetParCouleur implements Comparator<Sommet>{

	@Override
	public int compare(Sommet o1, Sommet o2) {
		if (o1.getCouleur() < o2.getCouleur())
			return -1;
		else if(o1.getCouleur() == o2.getCouleur())
			return 0;
		else return 1;
	}
}
