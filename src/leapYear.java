import java.util.Scanner;

public class leapYear {
        public static void main(String[] args) {
            System.out.println("Enter a year to check if it is a leap year (or enter 0 to exit):");

            Scanner input = new Scanner(System.in);
            int year;

            do {
                year = input.nextInt();

                if (year == 0) {
                    System.out.println("Exiting the program. Goodbye!");
                    break; // Exit the loop when the user inputs 0
                }

                if ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } while (true); // Keep repeating until the user inputs 0

            input.close(); // Close the scanner
        }
    }

