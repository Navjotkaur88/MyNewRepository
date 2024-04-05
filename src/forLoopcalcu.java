import java.util.Scanner;

public class forLoopcalcu {
    public static void main(String[] args) {
        Scanner lottery = new Scanner(System.in);
        int l = 0;
        System.out.println("Enter your lottery number from number 1-100, You can have maximum three tries: ");
        for (int i = 1; i <= 3 ; i++)
        {
            l = lottery.nextInt();
            {
                if (l != 55) {
                    System.out.println("Try again");
                } else {
                    System.out.println("You are winner");
                    break;
                }
            }
        }
        System.out.println("Please buy new lottery");
    }
}
