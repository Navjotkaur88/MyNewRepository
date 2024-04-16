package ClassObjects;

public class methodOverloading {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26, 7.8);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
