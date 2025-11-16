/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringpractice;

/**
 *
 * @author vishnugupta
 */
public class Stringmatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String str ="XZ";
        
        System.out.println(str.matches(".")); //Any character
        System.out.println(str.matches("abc"));//exactly given letters
        System.out.println(str.matches("[abc][vg]"));//Eather first and second set
        System.out.println(str.matches("[^abc]"));//Except abc
        System.out.println(str.matches("[a-z][A-Z][0-9]"));//a-z A-Z 0-1 like "aD4"  its true
        System.out.println(str.matches("A|b"));// A|b only
        System.out.println(str.matches("XZ"));//exactly XZ
    }

}
