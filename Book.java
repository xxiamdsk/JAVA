import java.io.*;
public class Book {
    public static void main(String[] args) {
        Console c=System.console();
    String s= c.readLine("Enter ur name");
    String m= c.readLine("Enter ur publisher");
    String l = c.readLine("Enter ur author");
    System.out.println("Book details "+s+m+l);
    }
    
}
