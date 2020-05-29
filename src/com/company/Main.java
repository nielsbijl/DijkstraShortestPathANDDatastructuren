package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //first journey
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

        System.out.println(AE.toString());

        //second journey
        Vertex utrecht = new Vertex("Utrecht Centraal");
        Vertex amsterdam = new Vertex("Amsterdam Centraal");
        Vertex limburg = new Vertex("Limburg Centraal");
        Vertex arnhnem = new Vertex("Arnhem Centraal");
        Vertex groningen = new Vertex("Groningen Centraal");

        utrecht.addNeighbour(new Treinrit(10, utrecht, amsterdam));
        utrecht.addNeighbour(new Treinrit(15, utrecht, limburg));
        amsterdam.addNeighbour(new Treinrit(30, amsterdam, groningen));
        limburg.addNeighbour(new Treinrit(10, limburg, arnhnem));
        limburg.addNeighbour(new Treinrit(10, limburg, groningen));
        arnhnem.addNeighbour(new Treinrit(10, arnhnem, groningen));

        dijkstra.computePath(utrecht);
        System.out.println("The Shortest Path To " + groningen.toString() + " = " + dijkstra.getShortestPathTo(groningen));
        System.out.println(groningen.getMinDistance() + " " + utrecht.getStaps().get(0).getWeightType());

        //third journey
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

        System.out.println(ELA.toString());

        //fourth journey
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

        System.out.println(BSV.toString());

        //if compareTo gives 0 means the train tickets are the same price!
        System.out.println(BSV.compareTo(ELA));
    }
}

//bron algorithm
//https://gist.github.com/artlovan/a07f29e16ab725f8077157de7abdf125
