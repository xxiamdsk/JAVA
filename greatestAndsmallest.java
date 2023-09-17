import java.io.Console;

public class greatestAndsmallest {
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter first number: "));
        int m = Integer.parseInt(c.readLine("Enter second number: "));
        int o = Integer.parseInt(c.readLine("Enter third number: "));
        int p = Integer.parseInt(c.readLine("Enter fourth number: "));

        int greatest = n;
        if (m > greatest) {
            greatest = m;
        }
        if (o > greatest) {
            greatest = o;
        }
        if (p > greatest) {
            greatest = p;
        }
        System.out.println("Greatest number is: " + greatest);

        int smallest = n;
        if (m < smallest) {
            smallest = m;
        }
        if (o < smallest) {
            smallest = o;
        }
        if (p < smallest) {
            smallest = p;
        }
        System.out.println("Smallest number is: " + smallest);

        System.out.println("Difference between greatest and smallest number is: " + (greatest - smallest) + "");


    }
        
}
