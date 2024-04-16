package ClassObjects;

public class Animal {
    String color;// Intance variable
    double height;
    Animal()
    {
        color = "blue";
        height = 6.0;
    }
    public void walk()
    {
        System.out.println("Animal height is: " +height);
    }
        public void eat()
        {
            System.out.println("Animal color is: " +color);
        }


    //If we call constructor without creating one java will automatic give default values
    // we create constructor to initialize values
}
