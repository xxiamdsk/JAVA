import java.io.Console;

public class Weeks_day {
    public static void main(String[] args) {
        Console c=System.console();

        int d=Integer.parseInt(c.readLine("Enter your day number: "));
        switch (d) {
            case 1:
            System.out.println("Day is Sunday");                
                break;
        
            case 2:
            System.out.println("Day is Monday");                
                break;
        
            case 3:
            System.out.println("Day is Tuesday");                
                break;
        
            case 4:
            System.out.println("Day is Wednesday");                
                break;
        
            case 5:
            System.out.println("Day is Thursday");                
                break;
        
            case 6:
            System.out.println("Day is Friday");                
                break;
        
            case 7:
            System.out.println("Day is Saturday");                
                break;
        
            default:
            System.out.println("Enter valid day number");
                break;
        }

    }
    
}
