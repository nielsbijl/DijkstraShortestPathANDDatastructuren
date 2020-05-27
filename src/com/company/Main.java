package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        int V = 5;
        int source = 0;

        // Adjacency list representation of the
        // connected edges
        List<List<Reis> > adj = new ArrayList<List<Reis> >();

        // Initialize list for every node
        for (int i = 0; i < V; i++) {
            List<Reis> item = new ArrayList<Reis>();
            adj.add(item);
        }

        // Inputs for the DPQ graph
        adj.get(0).add(new Reis(1, 9));
        adj.get(0).add(new Reis(2, 6));
        adj.get(0).add(new Reis(3, 5));
        adj.get(0).add(new Reis(4, 3));

        adj.get(2).add(new Reis(1, 2));
        adj.get(2).add(new Reis(3, 4));

        // Calculate the single source shortest path
        Stap dpq = new Stap(V);
        dpq.dijkstra(adj, source);

        // Print the shortest path to all the nodes
        // from the source node
        System.out.println("The shorted path from node :");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " to " + i + " is "
                    + dpq.dist[i]);
    }
}
