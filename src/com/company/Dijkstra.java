package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    double minDistanceEndPoint;
    public void computePath(Vertex sourceVertex) {
        sourceVertex.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) {
            Vertex vertex = priorityQueue.poll();

            for (Stap stap : vertex.getStaps()) {
                Vertex v = stap.getTargetVertex();
//                Vertex u = stap.getStartVertex();
                double weight = stap.getWeight();
                double minDistance = vertex.getMinDistance() + weight;

                if (minDistance < v.getMinDistance()) {
                    priorityQueue.remove(vertex);
                    v.setPreviosVertex(vertex);
                    v.setMinDistance(minDistance);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVerte) {
        List<Vertex> path = new ArrayList<>();

        for (Vertex vertex = targetVerte; vertex != null; vertex = vertex.getPreviosVertex()) {
            path.add(vertex);
        }

        Collections.reverse(path);
        this.minDistanceEndPoint = path.get(path.size() -1).getMinDistance();
        return path;
    }

    public double getMinDistanceEndPoint() {
        return minDistanceEndPoint;
    }
}
