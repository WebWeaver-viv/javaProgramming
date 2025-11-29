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
//          Scanner scan = new Scanner(System.in);
//            int year;
//
//            System.out.println("Enter year ");
//            year = scan.nextInt();
//
//            if (year % 4 == 0) {
//
//                if (year % 100 == 0) {
//
//                    if (year % 400 == 0) {
//                        System.out.println("Its leap year ");
//                    } else {
//                        System.out.println("Its not leap year ");
//                    }
//
//                } else {
//                    System.out.println("Its leap year ");
//                }
//
//            } else {
//                System.out.println("Its not leap year ");
//            }
//----------display name of a day based on number ------------
//        Scanner scan = new Scanner(System.in);
//        int num;
//
//        System.out.println("Enter a number");
//        num = scan.nextInt();
//
//        if (num == 1) {
//            System.out.println("Mon");
//        } else if (num == 2) {
//            System.out.println("Tue");
//        } else if (num == 3) {
//            System.out.println("Wed");
//        } else if (num == 4) {
//            System.out.println("Thu");
//        } else if (num == 5) {
//            System.out.println("Fri");
//        } else if (num == 6) {
//            System.out.println("Sut");
//        } else if (num == 7) {
//            System.out.println("Sun");
//        } else {
//            System.out.println("invalid number");
//        }


//------------- Find type of website and the protocol used ---------
               Scanner scan = new Scanner(System.in);
               String url ;
               
               System.out.println("Enter a URL");
               url = scan.nextLine();
               
               String protocol =url.substring(0 , url.indexOf(":"));
               
               if (protocol.equals("http"))
               {
                   System.out.println("Hypertext transfer protocol");
               }
               else if (protocol.equals("ftp"))
               {
                   System.out.println("File transfer protocol");
               }
                   
               String ext = url.substring(url.lastIndexOf(".")+1);
               if (ext.equals("com"))
               {
                   System.out.println("Commercial");
               }
               else if (ext.equals("org"))
               {
                   System.out.println("Organisation");
               }
               else if (ext.equals("net"))
               {
                   System.out.println("Network");
               }
                

    }

}
