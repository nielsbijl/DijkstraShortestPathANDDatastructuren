package com.company;

import java.util.List;

public class Reis{
    private String reisName;
    private Vertex startPoint;
    private Vertex targetPoint;
    private List<Vertex> stapTargetVertexs;
    private double weight;
    private String weightType;
    public Reis(String reisName){
        this.reisName = reisName;
    }
    public void addVertexes(List<Vertex> stapTargetVertexs){
        this.stapTargetVertexs = stapTargetVertexs;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setWeightType(String weightType){
        this.weightType = weightType;
    }
    public void setStartPoint(Vertex startPoint){
        this.startPoint = startPoint;
    }
    public void setTargetPoint(Vertex targetPoint){
        this.targetPoint = targetPoint;
    }
    public String toString(){
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(this.startPoint);

        String line1 = "The Shortest Path To " + this.targetPoint.toString() + " = " + dijkstra.getShortestPathTo(this.targetPoint);
        String line2 = this.targetPoint.getMinDistance() + " " + this.startPoint.getStaps().get(0).getWeightType();

        return line1 + "\n" + line2;
    }
}
