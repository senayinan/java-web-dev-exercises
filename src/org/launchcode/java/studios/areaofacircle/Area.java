package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();

    }
    public void calculateArea() {
        Scanner input = new Scanner(System.in);
        double userRadius = input.nextDouble();
        double area = Circle.getArea(userRadius);

        System.out.println(area);

    }
}