import java.io.Console;

class OddEven
{
  public static void main (String[]args)
  {
    Console c=System.console();
    String d = c.readLine(("Enter your number : "));
    int num =Integer.parseInt(d);

    String status = num % 2 == 0 ? " is Even" : " is Odd";
      System.out.println (num + status);
  }
} 
