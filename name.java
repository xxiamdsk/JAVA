import java.io.*;
public class Name {
    public static void main(String[] args) {
        Console c = System.console();
        String s = c.readLine("Enter first name");
        String m = c.readLine("Enter middle name");
        String l = c.readLine("Enter last name");
        System.out.println("Your name is " + s+m+l);
        
    }
}
