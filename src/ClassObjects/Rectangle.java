package ClassObjects;

public class Rectangle {
  //  public static void main(String[] args);
    double width = 30.00;
    double length = 50.00;
    double area;

        public double calculateArea(double width, double length)
        {
            area = width*length;
        //System.out.println("Area" +area);
        return area;
    }
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        double areaOfRec = rectangle.calculateArea(3.00,  4.00);
        System.out.println("Area is : " + areaOfRec);
       // rectangle.calculateArea();
    }
}

