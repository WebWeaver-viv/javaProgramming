
package scsc01;

import java .util.*;
public class SCSC01 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        switch(num){
            case 1: System.out.println("one");
                    break;
            case 2: System.out.println("two");
                    break;
            case 3: System.out.println("three");
                    break;
            case 4: System.out.println("four");
                    break;
            default:System.out.println("Invalid number");
                    break;
        }
        
    }
    
}
