package com.saurabh;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Triangle created with 3 points { ( "+pointA.getX()+','+pointA.getY()+" ), " +
                                                            "( "+pointB.getX()+','+pointB.getY()+" ), " +
                                                            "( "+pointC.getX()+','+pointC.getY()+" ), }");
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
