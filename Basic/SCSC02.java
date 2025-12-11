
package SCSC02;

import java .util.*;
public class SCSC02 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter domain name");
        Scanner sc = new Scanner(System.in);
        String domain = sc.nextLine();
        
        String ext = domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext){
            case "com": System.out.println("Commercial");
                    break;
            case "org": System.out.println("organisation");
                    break;
            case "net": System.out.println("network");
                    break;           
            default:System.out.println("Invalid ext");
                    break;
        }
        
    }
    
}
