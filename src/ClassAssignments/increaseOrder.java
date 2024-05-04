package ClassAssignments;

public class increaseOrder {
    public static void main(String[] args){
        int [] arr = new int[] {5,7,2,8,2,4,8,2,5,7,4,7,8,9};
                for (int i = 1; i < arr.length; i++)
                {
                    for (int j = i+1 ; j<arr.length; j++)
                    {
                        int temp = 0;
                        if (arr[i]>arr[j])
                        {
                            temp = arr[i];
                            arr[j] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
    }
}
