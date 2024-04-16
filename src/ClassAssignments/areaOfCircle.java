package ClassAssignments;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
    System.out.println("Please enter the radius of the circle");
    Scanner scanner = new Scanner(System.in);
    double radius;
        radius = scanner.nextDouble();
       double area = (radius * radius * Math.PI);
    {
        System.out.println("The area of the circle [radius = " + radius + "]: " + area);
    }
}
}


