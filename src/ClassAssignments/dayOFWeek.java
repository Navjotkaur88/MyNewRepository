package ClassAssignments;

import java.util.Objects;
import java.util.Scanner;

public class dayOFWeek {
        public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the day of week : ");
            String input = scanner.nextLine();

            switch (input)
            {
                case "Sunday" :
                case "sunday" :
                case "Saturday" :
                case "saturday" :
                    System.out.println("It is a weekend day");
                    break;
                default:
                    System.out.println("It isn't weekend!!");
            }
        }
    }
