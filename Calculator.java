import java.io.Console;
class Calculator{
    public static void main(String args[]){
        Console c = System.console();
        String s1 = c.readLine("Enter first number:");
        String s2 = c.readLine("Enter second number:");
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        System.out.println("Enter + to Addition. \n Enter - to Substraction. \n Enter * to Multiplication. \n Enter / to Division. \n ");
        String choice = c.readLine("Enter choice:");
        switch(choice){
            case "+":System.out.println("Addition:"+(n1+n2));
                    break;
            case "-":System.out.println("Substraction:"+(n1-n2));
                    break;
            case "*":System.out.println("Multiplication:"+(n1*n2));
                    break;
            case "/":System.out.println("Division:"+(n1/n2));
                    break;
            default:System.out.println("Enter from given choice");
                    break;
        }

    }
}