package com.company;

public class Rit extends Stap {

    public Rit(double weight, Vertex startVertex, Vertex targetVertex) {
        super(weight, startVertex, targetVertex);
        super.setWeightType("KM");
    }
}
