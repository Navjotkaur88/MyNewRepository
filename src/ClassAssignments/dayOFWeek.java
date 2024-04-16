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
                    //boolean b = Objects.equals(input, "Sunday");
                    System.out.println("It is a weekend day");
                    break;
                case "Saturday" :
                   // boolean b1 = Objects.equals(input, "Saturday");
                    System.out.println("It is a weekend day");
                default:
                    System.out.println("It isn't weekend!!");
            }

        }

    }
