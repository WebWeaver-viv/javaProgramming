
package SCCST07;

import java.util.*;

public class SCCST07 {

   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a URL");
        String url =  scan.nextLine();
        
        String protocol = url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
             System.out.println("hypertext transfer protocol");
        else if (protocol.equals("ftp"))
             System.out.println("file transfer protocol");
        
        String ext =url.substring(url.lastIndexOf(".")+1);
        
        if (ext.equals("com"))
             System.out.println("commercial");
        else if (ext.equals("org"))
             System.out.println("organisation");
        else if (ext.equals("net"))
             System.out.println("network");
    }
    
}
