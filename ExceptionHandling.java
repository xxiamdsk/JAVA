import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Console c = System.console();
        int a, b;
        try{
        a = Integer.parseInt(c.readLine("enter first number : "));
        b = Integer.parseInt(c.readLine("Enter second number: "));

        System.out.println("sum: "+a + b);
        System.out.println("sub: "+(a - b));
        System.out.println("mul: "+(a * b));
        System.out.println("div: "+(a / b));
        }
        catch(NumberFormatException e){
            System.out.println("Entered number is in not in valid format");
        }
        catch(ArithmeticException e){
            System.out.println("number can not be divisible by zero");
        }
        catch (Exception e) {
            System.out.println("Some exception wil occur");
        }
        finally{
            System.out.println("final runs");
        }
        
        System.out.println("out of try");

}

}

