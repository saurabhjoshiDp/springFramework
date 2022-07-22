package com.saurabh;
import java.util.List;
public class Triangle {
    private List<Point>points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        System.out.print("Triangle created with 3 points {  ");
        for(Point point: points){
            System.out.print("( "+point.getX()+','+point.getY()+" ), ");
        }
        System.out.println(" }");
    }
}


//public class Triangle {
//    String type;
//    private int height;
//
//    public Triangle(String type){
//        this.type = type;
//    }
//
//    public Triangle(int height){
//        this.height = height;
//    }
//
//    public Triangle(String type, int height) {
//        this.type = type;
//        this.height = height;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public void draw(){
//        System.out.println(this.type + " Triangle Drawn with height = "+ getHeight());
//    }
//}
