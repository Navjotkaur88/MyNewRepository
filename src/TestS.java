import java.util.Scanner;

public class TestS {
    public static <scanner> void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Scanner is a type even if it is a class and scanner is a
        System.out.println("Enter any number");
       // int num1 = scanner.nextInt();
        String name = scanner.nextLine();
        System.out.println(name);
        // memory leak
        //taking any type of input we use next
    }
}

/*
Welcome to my calculator
1. Press 1 for addition
2. Press 2 for multiplication
3. Press 3 for sub
4. Press 4 for div
5. Press 5 for modulus
8 for exit

 */
