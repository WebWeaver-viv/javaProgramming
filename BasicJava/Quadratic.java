import java.lang.*;
import java.util.Scanner;
import java.util.Scanner.*;

class Quadratic
    {
     public static void main(String[] args){

         int a,b,c;
         double r1, r2 ;
//         double d1 ,d2;
         System.out.println("Enter all side here: ");

         Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();


//         d1 = (b*b)-(4*a*c);
         r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);

//         d2 = (b*b)+(4*a*c);
         r2 =(-b - Math.sqrt(b*b-4*a*c))/(2*a);;
         System.out.println("root are  :" + r1 + " " + r2);


     }

    }
