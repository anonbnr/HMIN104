package tp4;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<Sommet> vertices = new ArrayList<>();
		vertices.add(new Sommet("x"));
		vertices.add(new Sommet("y"));
		vertices.add(new Sommet("z"));
		vertices.add(new Sommet("t"));
		vertices.add(new Sommet("u"));
		vertices.add(new Sommet("v"));

		ArrayList<Arete> edges = new ArrayList<>();
		edges.add(new Arete(new Sommet("x"), new Sommet("y")));
		edges.add(new Arete(new Sommet("x"), new Sommet("u")));
		edges.add(new Arete(new Sommet("x"), new Sommet("v")));
		edges.add(new Arete(new Sommet("y"), new Sommet("t")));
		edges.add(new Arete(new Sommet("y"), new Sommet("u")));
		edges.add(new Arete(new Sommet("z"), new Sommet("v")));
		edges.add(new Arete(new Sommet("t"), new Sommet("v")));

		Graphe monGraphe = new Graphe(vertices, edges);
		System.out.println(monGraphe);

		try {
			monGraphe = monGraphe.colorier(2);
			System.out.println(monGraphe);
		} catch (SommetNotFoundException | GrapheColorException e) {
			e.printStackTrace();
		}
	}
}
