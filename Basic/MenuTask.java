
package menutask;

import java.util.*;
public class MenuTask {

   
    public static void main(String[] args) {

      // ----------------- make a Menu Driven Program for Arithmatic Opration
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        
        System.out.println("Enter two Number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words");
        String option =sc.nextLine();
        option = option.toUpperCase();
        
        switch(option){
            case"ADD":System.out.println("Sum is " + (x + y));
                break;
            case"SUB":System.out.println("Difference is " + (x - y));
                break;
            case"MUL":System.out.println("Product is " + (x * y));
                break;
            case"DIV":System.out.println("Radio is " + (x / y));
                break;
            default:System.out.println("invalid option");
                break;
                    
        }
        
        
    }
    
}
