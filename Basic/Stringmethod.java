/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpractice;

/**
 *
 * @author vishnugupta
 */
public class Stringmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str1 ="Pyramid";
        String str2 ="Pyramid";
        
        System.out.println(str1.equals(str2));
        
       System.out.println(str1.equalsIgnoreCase(str2));
       
       System.out.println(str1==str2);

        String str3 ="china";
        String str4 = new String("pyramid");
        
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        
        System.out.println(str3.compareTo(str4));
    }
    
}
