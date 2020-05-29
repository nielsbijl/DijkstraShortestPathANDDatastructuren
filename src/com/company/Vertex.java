package com.company;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable {
    private String name;
    private List<Stap> staps;
    private boolean visited;
    private Vertex previosVertex;
    private double minDistance = Double.MAX_VALUE;

    public Vertex(String name) {
        this.name = name;
        this.staps = new ArrayList<>();
    }

    public void addNeighbour(Stap stap) {
        this.staps.add(stap);
    }

    public List<Stap> getStaps() {
        return staps;
    }

    public void setStaps(List<Stap> staps) {
        this.staps = staps;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviosVertex() {
        return previosVertex;
    }

    public void setPreviosVertex(Vertex previosVertex) {
        this.previosVertex = previosVertex;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object otherVertex) {
        return Double.compare(this.minDistance, ((Vertex)otherVertex).minDistance);
    }
}
