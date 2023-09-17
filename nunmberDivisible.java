import java.io.Console;

public class nunmberDivisible {
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter a number: "));
        boolean isDivisible = false;
        if (n % 5 == 0 && n % 11 == 0) {
            isDivisible = true;
        }
        
        if (isDivisible) {
            System.out.println(n + " is divisible by 5 and 11");
        } else {
            System.out.println(n + " is not divisible by 5 and 11");
        }
    }
}
