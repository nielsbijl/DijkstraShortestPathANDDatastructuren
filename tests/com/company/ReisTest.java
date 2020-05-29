package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReisTest {

    @Test
    void testToString() {
        Reis AE = new Reis("A to E");
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

        AE.setStartPoint(a);
        AE.setTargetPoint(e);
        AE.addVertexes(dijkstra.getShortestPathTo(e));
        AE.setWeight(e.getMinDistance());
        AE.setWeightType(a.getStaps().get(0).getWeightType());

        assertEquals(AE.toString(), "The Shortest Path To E = [A, B, D, E]\n" + "24.0 KM");
    }

    @Test
    void compareTo() {
        //
        //First journey
        //
        Dijkstra dijkstra = new Dijkstra();
        Vertex eindhoven = new Vertex("Einhoven Airport");
        Vertex la = new Vertex("Los Angeles Airport");
        Vertex ny = new Vertex("New York Airport");

        eindhoven.addNeighbour(new Vlucht(1100, eindhoven, la));
        eindhoven.addNeighbour(new Vlucht(800, eindhoven, ny));
        ny.addNeighbour(new Vlucht(400, ny, la));

        dijkstra.computePath(eindhoven);

        Reis ELA = new Reis("Eindhoven to Los Angeles");
        ELA.setStartPoint(eindhoven);
        ELA.setTargetPoint(la);
        ELA.addVertexes(dijkstra.getShortestPathTo(la));
        ELA.setWeight(la.getMinDistance());
        ELA.setWeightType(eindhoven.getStaps().get(0).getWeightType());

        //
        //Second journey
        //

        Vertex berlin = new Vertex("Berlin Airport");
        Vertex texas = new Vertex("texas Airport");
        Vertex siliconValley = new Vertex("Silicon Valley Airport");

        berlin.addNeighbour(new Vlucht(1000, berlin, texas));
        berlin.addNeighbour(new Vlucht(1100, berlin, siliconValley));
        texas.addNeighbour(new Vlucht(800, texas, siliconValley));

        dijkstra.computePath(berlin);

        Reis BSV = new Reis("Berlin to Silicon Valley");
        BSV.setStartPoint(berlin);
        BSV.setTargetPoint(siliconValley);
        BSV.addVertexes(dijkstra.getShortestPathTo(siliconValley));
        BSV.setWeight(siliconValley.getMinDistance());
        BSV.setWeightType(berlin.getStaps().get(0).getWeightType());

        //test the same values
        assertEquals(BSV.compareTo(ELA), 0);
        assertEquals(ELA.compareTo(BSV), 0);

        //change the values
        berlin.addNeighbour(new Vlucht(200, berlin, siliconValley));
        dijkstra.computePath(berlin);
        BSV.setStartPoint(berlin);
        BSV.setTargetPoint(siliconValley);
        BSV.addVertexes(dijkstra.getShortestPathTo(siliconValley));
        BSV.setWeight(siliconValley.getMinDistance());
        BSV.setWeightType(berlin.getStaps().get(0).getWeightType());

        //test different values
        assertEquals(BSV.compareTo(ELA), -1);
        assertEquals(ELA.compareTo(BSV), 1);
    }
}