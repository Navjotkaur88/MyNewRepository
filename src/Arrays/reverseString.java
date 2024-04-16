package Arrays;

public class reverseString {
    static void reverse(char[] arr, int n) {
        for (char i = 0; i < n / 2; i++) {
            char temp = (char) arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("Reversed array is:");
        for (char k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        char[] arr = {'p', 'r', 'a','g' , 'r', 'a'};
        reverse(arr, arr.length);
    }
}

