
package sccst02;

import java.util.*;

public class SCCST02 {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Age");
        int age =  scan.nextInt();
        
        if (age>=18 && age <= 40)
        {
            System.out.println("person is Young");
        }else if (age <= 18)
        {
            System.out.println("person is not young");
        } else 
        {
            System.out.println("person is old ");
        }
    }
    
}
