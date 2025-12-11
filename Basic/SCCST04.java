
package SCCST04;

import java.util.*;

public class SCCST04 {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        String num =  scan.nextLine();
        
        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix is 2");
        } else if (num.matches("[0-7]+"))
        {
            System.out.println("octal Radix is 8");
        }else if (num.matches("[0-9]+"))
        {
            System.out.println("decimal Radix is 10");
        } else if (num.matches("[0-9A-F]+"))
        {
            System.out.println("hexa Radix is 16");
        } else 
        {
            System.out.println("Invilad number");
        }
        
    }
    
}
