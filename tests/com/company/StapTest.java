package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StapTest {

    @Test
    void getWeight() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        Stap ab = new Rit(10, a, b);
        assertEquals(ab.getWeight(), 10);
    }

    @Test
    void setWeightType() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        Stap ab = new Rit(10, a, b);
        assertEquals(ab.getWeightType(), "KM");
    }

    @Test
    void getWeightType() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        Stap ab = new Rit(10, a, b);
        assertEquals(ab.getWeightType(), "KM");
    }

    @Test
    void getStartVertex() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        Stap ab = new Rit(10, a, b);

        assertEquals(ab.getStartVertex(), a);
    }

    @Test
    void getTargetVertex() {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");

        Stap ab = new Rit(10, a, b);

        assertEquals(ab.getTargetVertex(), b);
    }
}