package com.company;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VertexTest {

    @org.junit.jupiter.api.Test
    void addNeighbour() {
        List<Stap> test = new ArrayList<>();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");

        Stap ab = new Rit(10, a, b);
        Stap ac = new Rit(15, a, c);

        test.add(ab);
        test.add(ac);

        a.addNeighbour(ab);
        a.addNeighbour(ac);

        assertEquals(test, a.getStaps());
    }

    @org.junit.jupiter.api.Test
    void getStaps() {
        //zie test hierboven ^^^
    }

    @org.junit.jupiter.api.Test
    void getPreviosVertex() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        b.setPreviosVertex(a);

        assertEquals(a, b.getPreviosVertex());

    }

    @org.junit.jupiter.api.Test
    void setPreviosVertex() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        b.setPreviosVertex(a);

        assertEquals(a, b.getPreviosVertex());
    }

    @org.junit.jupiter.api.Test
    void getMinDistance() {
        Vertex a = new Vertex("A");
        assertEquals(a.getMinDistance(), Double.MAX_VALUE);
    }

    @org.junit.jupiter.api.Test
    void setMinDistance() {
        Vertex a = new Vertex("A");
        a.setMinDistance(10);
        assertEquals(a.getMinDistance(), 10);
    }
}