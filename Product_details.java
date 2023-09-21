import java.io.*;
public class Product_details {
    public static void main(String[] args) {
        Console c=System.console();
    String s= c.readLine("Enter ur name");
    String m= c.readLine("Enter ur manufacture");
    String l = c.readLine("Enter ur price");
    System.out.println("product details "+s+"\n"+m+"\n"+l);
    }
    
}