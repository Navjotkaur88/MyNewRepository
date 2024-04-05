import java.util.Scanner;

public class lotterySystem {
    public static void main(String[] args) {
        char c;
        int counter = 1;
        do {
            System.out.println(counter);
        Scanner lottery = new Scanner(System.in);
        System.out.println("\nEnter your number to win lottery:");
        int i = lottery.nextInt();
        if (i != 55) {
            System.out.println("Try again next time");
        }
        else {
            System.out.println("You are Winner, Congratulations!");
            break;
        }
       System.out.println("Do you want to try one more time\nPress Y for yes ");
            c = lottery.next().charAt(0);
            //System.out.println("Do you want to try one more time\nPress Y for yes ");
            counter++;
    }  while(counter <= 3 && c == 'y' || c == 'Y');
        //System.out.println("Sorry, You have reached your maximum limits, Please buy another lottery");
        //  While()}
    }
}