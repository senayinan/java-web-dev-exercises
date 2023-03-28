package exercises;
import java.util.Scanner;

public class AreaOfRectangle {

    public void  getDimensionsAndPrint ()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?:");

        int length = input.nextInt();

        System.out.println("What is the width of the rectangle?:");

        int width = input.nextInt();

        input.close();

        int areaSize = calculateArea(length, width);

        System.out.println("Area size: "+ areaSize);




    }

    public int calculateArea (int length, int width ) {

        int areaOfRect = length * width;

        return  areaOfRect;
    }
}
