import java.io.*;
public class Order_details {
    public static void main(String[] args) {
    Console c=System.console();
    String s= c.readLine("Enter order id");
    int id=Integer.parseInt(s);
    String m= c.readLine("Enter product name");
    String l = c.readLine("Enter quantity");
        int q=Integer.parseInt(l);

    System.out.println("order details "+id+"\n"+m+"\n"+q);
    }
    
}