package ClassAssignments;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner Grade = new Scanner(System.in);

        System.out.println("Enter Student Marks here: ");
        double marks;
        marks = Grade.nextDouble();

         System.out.print("\nGrade = ");
         if (marks >= 90 && marks < 100)
            System.out.println("A");
        else if (marks >= 80 && marks < 89)
            System.out.println("B");
        else if (marks >= 77 && marks < 79)
            System.out.println("C");
        else if (marks >= 60 && marks < 69)
            System.out.println("D");
        else if (marks < 59)
            System.out.println("E, Fail, Please try next year");
        else if (marks > 100)
            System.out.println("Null");
    }

}