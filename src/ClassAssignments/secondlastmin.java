package ClassAssignments;

public class secondlastmin {
    public static void main(String[] args) {
        //public static int getMinValue ( int[] array){
        int[] array = {10, 324, 45, 90808, 9808};
        int minvalue = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > minvalue)
            {
                minvalue = array[i];
            }
        System.out.println("Second largest element in the given array is: " + minvalue);
        // return minValue
    }
}

