package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    @Test
    void computePath() {
    }

    @Test
    void getShortestPathTo() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        a.addNeighbour(new Rit(10, a, b));
        a.addNeighbour(new Rit(15, a, c));
        b.addNeighbour(new Rit(12, b, d));
        b.addNeighbour(new Rit(15, b, f));
        c.addNeighbour(new Rit(10, c, e));
        d.addNeighbour(new Rit(1, d, f));
        d.addNeighbour(new Rit(2, d, e));
        f.addNeighbour(new Rit(5, f, e));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(a);

        List<Vertex> testPath = new ArrayList<>();
        testPath.add(a);
        testPath.add(b);
        testPath.add(d);
        testPath.add(e);

        assertEquals(dijkstra.getShortestPathTo(e), testPath);
    }

    @Test
    void getMinDistanceEndPoint() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        a.addNeighbour(new Rit(10, a, b));
        a.addNeighbour(new Rit(15, a, c));
        b.addNeighbour(new Rit(12, b, d));
        b.addNeighbour(new Rit(15, b, f));
        c.addNeighbour(new Rit(10, c, e));
        d.addNeighbour(new Rit(1, d, f));
        d.addNeighbour(new Rit(2, d, e));
        f.addNeighbour(new Rit(5, f, e));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(a);

        assertEquals(e.getMinDistance(), 24.0);
    }
}