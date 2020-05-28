package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        a.addNeighbour(new Edge(10, a, b));
        a.addNeighbour(new Edge(15, a, c));

        b.addNeighbour(new Edge(12, b, d));
        b.addNeighbour(new Edge(15, b, f));

        c.addNeighbour(new Edge(10, c, e));

        d.addNeighbour(new Edge(1, d, f));
        d.addNeighbour(new Edge(2, d, e));

        f.addNeighbour(new Edge(5, f, e));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(a);

        System.out.println(dijkstra.getShortestPathTo(e));
    }
}

//bron algorithm
//https://gist.github.com/artlovan/a07f29e16ab725f8077157de7abdf125
