
package SCCST06;

import java.util.*;

public class SCCST06 {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int num =  scan.nextInt();
        
        switch(num){
            case 1: System.out.println("Mon");
                break;
            case 2: System.out.println("tue");
                break;
            case 3: System.out.println("wed");
                break;
            case 4: System.out.println("thus");
                break;
            case 5: System.out.println("fri");
                break;
            case 6: System.out.println("sat");
                break;
            case 7: System.out.println("sun");
                break;
            default :System.out.println("invailid");
                break;               
        }
      
    }
    
}
