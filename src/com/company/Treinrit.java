package com.company;

public class Treinrit extends Stap{

    public Treinrit(double weight, Vertex startVertex, Vertex targetVertex) {
    super(weight, startVertex, targetVertex);
    super.setWeightType("Min");
    }
}
