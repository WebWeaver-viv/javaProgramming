
package SCCST03;

import java.util.*;

public class SCCST03 {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Marks");
        int marks =  scan.nextInt();
        
        if (marks < 80 )
            if ( marks >= 60  )
            {
                System.out.println("A");
            } else if ( marks >= 40  )
            {
                System.out.println("B");
            }else if ( marks >= 30  )
            {
                System.out.println("C");
            } else
            {
                System.out.println("Fail");
            }else {
            System.out.println("A+");
        }
    }
    
}
