import java.util.ArrayList;

public class Test {

	public static Graphe fillPetitGraphe() {
		ArrayList<Sommet> petitVertices = new ArrayList<>();
		petitVertices.add(new Sommet("x"));
		petitVertices.add(new Sommet("y"));
		petitVertices.add(new Sommet("z"));
		petitVertices.add(new Sommet("t"));
		petitVertices.add(new Sommet("u"));
		petitVertices.add(new Sommet("v"));

		ArrayList<Arete> petitEdges = new ArrayList<>();
		petitEdges.add(new Arete(new Sommet("x"), new Sommet("y")));
		petitEdges.add(new Arete(new Sommet("x"), new Sommet("u")));
		petitEdges.add(new Arete(new Sommet("x"), new Sommet("v")));
		petitEdges.add(new Arete(new Sommet("y"), new Sommet("t")));
		petitEdges.add(new Arete(new Sommet("y"), new Sommet("u")));
		petitEdges.add(new Arete(new Sommet("z"), new Sommet("v")));
		petitEdges.add(new Arete(new Sommet("t"), new Sommet("v")));

		Graphe petitGraphe = new Graphe(petitVertices, petitEdges);

		return petitGraphe;
	}

	public static Graphe fillGrandGraphe() {
		ArrayList<Sommet> grandVertices = new ArrayList<>();

		grandVertices.add(new Sommet("b"));
		grandVertices.add(new Sommet("c"));
		grandVertices.add(new Sommet("d"));
		grandVertices.add(new Sommet("e"));
		grandVertices.add(new Sommet("f"));
		grandVertices.add(new Sommet("g"));
		grandVertices.add(new Sommet("h"));
		grandVertices.add(new Sommet("j"));
		grandVertices.add(new Sommet("k"));
		grandVertices.add(new Sommet("m"));

		ArrayList<Arete> grandEdges = new ArrayList<>();

		grandEdges.add(new Arete(new Sommet("b"), new Sommet("c")));
		grandEdges.add(new Arete(new Sommet("b"), new Sommet("d")));
		grandEdges.add(new Arete(new Sommet("b"), new Sommet("e")));
		grandEdges.add(new Arete(new Sommet("b"), new Sommet("k")));
		grandEdges.add(new Arete(new Sommet("b"), new Sommet("m")));
		grandEdges.add(new Arete(new Sommet("c"), new Sommet("m")));
		grandEdges.add(new Arete(new Sommet("d"), new Sommet("k")));
		grandEdges.add(new Arete(new Sommet("d"), new Sommet("m")));
		grandEdges.add(new Arete(new Sommet("e"), new Sommet("f")));
		grandEdges.add(new Arete(new Sommet("e"), new Sommet("j")));
		grandEdges.add(new Arete(new Sommet("e"), new Sommet("m")));
		grandEdges.add(new Arete(new Sommet("f"), new Sommet("j")));
		grandEdges.add(new Arete(new Sommet("f"), new Sommet("m")));
		grandEdges.add(new Arete(new Sommet("g"), new Sommet("h")));
		grandEdges.add(new Arete(new Sommet("g"), new Sommet("j")));
		grandEdges.add(new Arete(new Sommet("g"), new Sommet("k")));
		grandEdges.add(new Arete(new Sommet("h"), new Sommet("j")));
		grandEdges.add(new Arete(new Sommet("j"), new Sommet("k")));

		Graphe grandGraphe = new Graphe(grandVertices, grandEdges);

		return grandGraphe;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Graphe petitGraphe = fillPetitGraphe();
		System.out.println("le pretit graphe\n===============");
		System.out.println(petitGraphe);

		try {
			System.out.println("\n");
			System.out.println("2-coloriage du petit graphe\n===========================");
			petitGraphe = petitGraphe.colorierOptimiste(2);
			System.out.println(petitGraphe);

			petitGraphe = fillPetitGraphe();
			System.out.println("\n");
			System.out.println("3-coloriage du petit graphe\n===========================");
			petitGraphe = petitGraphe.colorierOptimiste(3);
			System.out.println(petitGraphe);

			Graphe grandGraphe = fillGrandGraphe();
			System.out.println("\n");
			System.out.println("le grand graphe\n===============");
			System.out.println(grandGraphe);
			System.out.println("\n");
			System.out.println("4-coloriage du grand graphe\n===========================");
			grandGraphe = grandGraphe.colorierOptimiste(4);
			System.out.println(grandGraphe);

		} catch (SommetNotFoundException | GrapheColorException e) {
			e.printStackTrace();
		}
	}
}
