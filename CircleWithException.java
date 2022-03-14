package Week8;

import java.util.Scanner;

public class CircleWithException {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the radius : ");
        double radius = sc.nextDouble();

        try{
            Circle_Exception circle = new Circle_Exception(radius);
            System.out.println("The radius is "+circle.getRadius());
            System.out.println("The area is "+circle.getArea());
            System.out.println("The diameter is "+circle.getDiameter());
        }catch(Circle_Exception ce){
            System.err.print(ce);

        }


        sc.close();
    }
}