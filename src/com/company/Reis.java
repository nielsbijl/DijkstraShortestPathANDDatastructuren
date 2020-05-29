package com.company;

import java.util.List;

public class Reis implements Comparable{
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
    public String getWeightType(){
        return this.weightType;
    }
    public double getWeight(){
        return this.weight;
    }
    public String toString(){
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(this.startPoint);

        String line1 = "The Shortest Path To " + this.targetPoint.toString() + " = " + dijkstra.getShortestPathTo(this.targetPoint);
        String line2 = this.targetPoint.getMinDistance() + " " + this.startPoint.getStaps().get(0).getWeightType();

        return line1 + "\n" + line2;
    }

    @Override
    public int compareTo(Object compareReis) {
        //if the weight is the same return 0
        //if the base weight is more then de compareReis weight return 1
        //if you can't compare them return -1
        if (this.weightType == ((Reis) compareReis).getWeightType()){
            if (this.weight == ((Reis) compareReis).getWeight()){
                return 0;
            }
            if (this.weight > ((Reis) compareReis).getWeight()){
                return 1;
            }
        }
        else {
            System.out.println("you can't compare " + this.weightType + " with " + ((Reis) compareReis).getWeightType());
        }
        return -1;
    }
}
