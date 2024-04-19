package Arrays;

public class FirstArrayProg {
 //starts with 0 , as indexing starts from zero
// store same types of Object and Data type variable
    public static void main(String[] args)
    {
        int[] arr = {23,5,7,8,9,555,34,36,90};//stored in the heap memory
        int sum = 0;
      //  int i;
       for (int i = 1; i< arr.length ; i++) {
           sum += arr[i];
            System.out.println(sum);
        }
        }
    }

