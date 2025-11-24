// find grades for given marks

package relational;
import java.util.Scanner;
public class SCGrade {
    public static void main(String[] args) {
       
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a marks ");
        grade = sc.nextInt();
        
        if(grade >= 80 &&  grade <= 100 ){
        System.out.println("A+");
        } else if (grade >= 60 &&  grade <= 80){
        System.out.println("A");
        }else if (grade >= 50 &&  grade <= 60){
        System.out.println("B");
        }else if (grade >= 33 &&  grade <= 50){
        System.out.println("C");
        }else {
        System.out.println("Fail + D ");
        }
    }
}
