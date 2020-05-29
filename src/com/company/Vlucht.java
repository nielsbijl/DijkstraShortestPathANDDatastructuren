package com.company;

public class Vlucht extends Stap{

    public Vlucht(double weight, Vertex startVertex, Vertex targetVertex) {
        super(weight, startVertex, targetVertex);
        super.setWeightType("Euro");
    }
}
