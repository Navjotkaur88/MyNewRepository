package ClassAssignments;

import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
        System.out.println("Please enter the radius of the circle");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        double square = side * side;
        {
            System.out.println("The area of the square = " + square);
        }
    }
}
