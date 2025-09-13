import java.lang.*;
import java.util.Scanner;
import java.util.Scanner.*;

class Equation {
    public static void main(String[]args)
    {

        int length , height, breadth;
        int totalArea, Volume;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter All values length Height and Breadth: ");
        length = sc.nextInt();
        height = sc.nextInt();
        breadth = sc.nextInt();

        Volume = 2*(length * breadth + length * height + breadth * height);
        totalArea = length * height * breadth;
        System.out.println("this is Volume of rectangle : " + Volume);
        System.out.println("this is totalArea of rectangle : " + totalArea);



    }
}
