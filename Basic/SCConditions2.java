
package scconditions2;
import java.util.*;

public class SCConditions2 {

    
    public static void main(String[] args) {
        
//   --------- Find radix of a number given in a String -----------
        
//       
//        Scanner scan = new Scanner(System.in);
//        String num;
//        
//        System.out.println("Enter a Number");
//         num=scan.nextLine();
//         
//         if(num.matches("[01]+"))
//         {
//         System.out.println("Binary Radix = 2");
//         }else if(num.matches("[0-7]+"))
//         {
//         System.out.println("Octal Radix = 8");
//         }else if(num.matches("[0-9]+"))
//         {
//         System.out.println("Decimal Radix = 10");
//         }else if(num.matches("[0-9A-F]+"))
//         {
//         System.out.println("Hexa Radix = 16");
//         } else {
//         System.out.println("Not  a number");
//         }



// --------- Find  a given year is  a leap year ----------

          Scanner scan = new Scanner(System.in);
            int year;

            System.out.println("Enter year ");
            year = scan.nextInt();

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {
                        System.out.println("Its leap year ");
                    } else {
                        System.out.println("Its not leap year ");
                    }

                } else {
                    System.out.println("Its leap year ");
                }

            } else {
                System.out.println("Its not leap year ");
            }

             
    }


    
}
