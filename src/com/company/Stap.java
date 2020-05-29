package com.company;

abstract class Stap {
    private double weight;
    private String weightType;
    private Vertex startVertex;
    private Vertex targetVertex;

    public Stap(double weight, Vertex startVertex, Vertex targetVertex) {
        this.weight = weight;
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeightType(String weightType){this.weightType = weightType;}

    public String getWeightType() {
        return weightType;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

}
