
// find a person is  young or not young 


package relational;
import java.util.Scanner;
public class SCYoung {
    public static void main(String[] args) {
       
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Age ");
        age = sc.nextInt();
        
        if(age >= 18  && age <= 55){
        System.out.println("A person is  Young");
        } else if ( age < 18 || age >= 55){
        System.out.println("A person is not  Young");
        }
    }
}
