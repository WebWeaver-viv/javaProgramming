/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpractice;

/**
 *
 * @author vishnugupta
 */
public class Stringpractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str = "Mr.Shahrukh Khan";
        
        System.out.println(str.startsWith("Mr."));
        System.out.println(str.startsWith("Shah", 3));
        System.out.println(str.endsWith("Khan"));
        System.out.println(str.charAt(3));
        
        String str1 = "www.vivaan4wild.com";
        
        System.out.println(str1.indexOf("vivaan4wild"));
        System.out.println(str1.indexOf(".",4));
        System.out.println(str1.lastIndexOf("."));
        
       


    }
    
}
