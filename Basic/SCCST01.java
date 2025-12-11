
package sccst01;

import java.util.*;

public class SCCST01 {

   
    public static void main(String[] args) {
      //How to check if a number is ODD or EVEN
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =  scan.nextInt();
        
        
        
        if(num%2==0)
        {
            System.out.println("number is Even");
        }else
        {
            System.out.println("number is Odd");
        }
    }
    
}
