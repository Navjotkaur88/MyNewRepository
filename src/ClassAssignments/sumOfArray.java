package ClassAssignments;

public class sumOfArray {
    public static void main(String[] args)
    {
        int[] arr = {23,5,7,8,9,555,34,36,90};//stored in the heap memory
        int sum = 0;
        for (int i = 1; i< arr.length ; i++) {
            sum += arr[i];
            System.out.println("Sum of Array element is : " +sum);
        }
    }
}
