// this is  a quetion
// Find a number odd or even  


package relational;
import java.util.Scanner;
public class SCConditions {
    public static void main(String[] args) {
       
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        n = sc.nextInt();
        
        if(n % 2 == 0 ){
        System.out.println("This number is even");
        } else if ( n % 2 != 0 ){
        System.out.println("This number is odd");
        }
    }
}



