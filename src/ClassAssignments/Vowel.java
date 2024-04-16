package ClassAssignments;

import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
    System.out.println("Please enter a letter to check if it a vowel: ");
        Scanner letter = new Scanner(System.in);
        char l = letter.next().charAt(0);

            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U')
            {
                System.out.println("It's a vowel");
            }
            else
            {
                System.out.println("It is not a vowel");
            }
        }

    }