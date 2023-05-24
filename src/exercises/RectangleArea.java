package exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the Rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the Rectangle: ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("Area of Rectangle is: " + area);
    }
}
