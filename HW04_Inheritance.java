import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        double[] A = new double[3];
        String color;
        boolean fill;
        Scanner sc = new Scanner(System.in);
        A[0] = sc.nextDouble();
        A[1] = sc.nextDouble();
        A[2] = sc.nextDouble();
        color = sc.next();
        fill = sc.nextBoolean();
        GeometricObject geoObject = new Triangle(A[0], A[1], A[2], color, fill);
        System.out.println("Triangle: side1 = "+ geoObject.printSide1() + " side2 = " + geoObject.printSide2() + " side3 = "+ geoObject.printSide3());
        System.out.println("The area is " + geoObject.getArea());
        System.out.println("The perimeter is " + geoObject.getPerimeter());
        System.out.println(geoObject.getColor());
        System.out.println(geoObject.isFilled());
    }
    
}
abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double printSide1();
    public abstract double printSide2();
    public abstract double printSide3();
}

class Triangle extends GeometricObject{
    private double radius;
    private double side1, side2, side3;
    public Triangle(double side1, double side2, double side3, String color, boolean fillup){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(fillup);
    }
    public double getArea(){
        double s;
        s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public double printSide1(){
        return side1;
    }
    public double printSide2(){
        return side2;
    }
    public double printSide3(){
        return side3;
    }
}