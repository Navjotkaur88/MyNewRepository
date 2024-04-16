package ClassAssignments;

import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class trafficLight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String light = scanner.nextLine();
        if (light.equals("red"))
            System.out.println("Please stop the Car");
         else if (light.equals("green"))
            System.out.println("Please do not stop the car");
         else if (light.equals("yellow"))
            System.out.println("go slow");
    }
}
