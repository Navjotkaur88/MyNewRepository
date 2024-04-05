import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        //boolean decision;
        Scanner scanner = new Scanner(System.in);
        char c;
do {
    System.out.println("Welcome to my Calculator");
    System.out.println("Press 1 addition");
    System.out.println("Press 2 for Subtraction");
    System.out.println("Press 3 for Multiplication");
    System.out.println("Press 4 for Division");
    System.out.println("Press 5 for Modular");
    System.out.println("Enter your first input: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter your second input: ");
    int num2 = scanner.nextInt();
    System.out.println("Enter your choice: ");
    int input = scanner.nextInt();
    double result;

    switch (input) {
        case 1:
            result = num1 + num2;
            System.out.println("Addition is" + result);
            break;
        case 2:
            result = num1 - num2;
            System.out.println("Subtraction is" + result);
            break;
        case 3:
            result = num1 * num2;
            System.out.println("Multiplication is" + result);
            break;
        case 4:
            result = num1 / num2;
            System.out.println("Division is" + result);
            break;
        case 5:
            result = num1 % num2;
            System.out.println("Modular is" + result);
            break;
        default:
            System.out.println("Nothing found!!");
          }
    //decision = scanner.nextBoolean();
         System.out.println("Would you like to continue else\nPress Y for yes ");
        c = scanner.next().charAt(0);
    }  while(c == 'y' || c == 'Y');
       // while (decision);
    }
        }



        /*
    int input
        */


