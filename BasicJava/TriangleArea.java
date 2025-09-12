import java.lang.*;
import java.util.Scanner;
import java.util.Scanner.*;

class TriangleArea {
    public static void main(String[] args)
    {

        int a,b,c;
        float s;
        double area;
        System.out.println("Enter all three sides of the triangle: ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Semiperimeter of the triangle is: \" : " + s );
        System.out.println("Area of the triangle is: " + area );


    }

}

