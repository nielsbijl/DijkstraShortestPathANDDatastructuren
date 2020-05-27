package com.company;

import java.util.Comparator;

public class Reis implements Comparator<Reis> {
    public int node;
    public int cost;

    public Reis()
    {
    }

    public Reis(int node, int cost)
    {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compare(Reis node1, Reis node2)
    {
        if (node1.cost < node2.cost)
            return -1;
        if (node1.cost > node2.cost)
            return 1;
        return 0;
    }
}

//Dijkstra algoritm Bron:
//https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-in-java-using-priorityqueue/
