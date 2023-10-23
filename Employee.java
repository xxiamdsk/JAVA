import java.io.Console;
public class Employee {
    public static void main(String[] args) {

        System.out.println("Enter details of 5 Employees: ");
        Employee emp[] = new Employee[5];
        for (int i = 0; i < 5; i++) {
            emp[i] = new Employee();
            emp[i].input();
        }

        System.out.println("Employee data whose salary is greater than 10000:");
        for (int i = 0; i < 5; i++) {
            if (emp[i].salary > 10000) {
                emp[i].display();
            }
        }

    }
    
    String name;
    int salary;
    int year;

    void input() {
        Console c = System.console();
        name = c.readLine("name: ");
        salary = Integer.parseInt(System.console().readLine("salary: "));
        year = Integer.parseInt(System.console().readLine("year: "));
    }
    
    void display() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("year: " + year);
    }
    
}
