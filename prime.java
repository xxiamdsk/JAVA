import java.io.*;
class prime {
    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(console.readLine("Enter a number: "));
        boolean isPrime = true;            
        for (int j = 2; j < n/2; j++) 
        {
            if (n % j == 0) 
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime) 
        {
            System.out.println(n + " is a prime number");
        } 
        else 
        {
            System.out.println(n + " is not a prime number");
        }
        
    }
}
