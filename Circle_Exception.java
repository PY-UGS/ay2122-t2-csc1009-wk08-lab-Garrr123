package Week8;

public class Circle_Exception extends Exception {
    private double radius;
    public Circle_Exception(){

    }
    public Circle_Exception(double radius) throws Exception{
        this.radius = radius;
        if(radius <0) throw new IllegalArgumentException("Please input positive number");
        if(getArea()>1000) throw new Exception("Please input value <= 1000");


    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.pow(getRadius(),2)*Math.PI;
        return area;

    }

    public double getDiameter(){
        return 2*radius;
    }



}
