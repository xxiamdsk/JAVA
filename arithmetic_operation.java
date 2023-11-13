import java.io.*;

 class arithmetic_operation {
    public static void main(String[] args) {
        Console c = System.console();
        int a=Integer.parseInt(c.readLine("Enter yout first number :"));
        int b = Integer.parseInt(c.readLine("Enter your second number :"));
        int sum = a + b;
        System.out.println("Sum of two number is: "+sum);
    }
}
