package Arrays;

import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner myArray = new Scanner(System.in);
        System.out.println("Enter any number");
        int arrsize  = myArray.nextInt();
        int[] arr;
        arr = new int[arrsize];
        for (int i = 0; i < arrsize; i++) {
            //sum = sum + myArray[i];
        }
        System.out.println("The sum is: " + arrsize);
        /*


        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println(sum);
        }*/
    }
}
