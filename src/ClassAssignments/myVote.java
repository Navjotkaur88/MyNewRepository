package ClassAssignments;

import java.util.Scanner;

public class myVote {
    public static void main(String[] args) {
        System.out.println("Please enter your age to know if you are eligible for voting");
        Scanner scanner = new Scanner(System.in);
        double age = scanner.nextDouble();
        if(age == 18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote");
        }
    }
}
