import java.io.Console;
public class SalesRecord {
    String name;
    int year;
    int sales;
    void input() {
        Console c = System.console();
        name = c.readLine("name: ");
        year = Integer.parseInt(System.console().readLine("year: "));
        sales = Integer.parseInt(System.console().readLine("sales: "));
    }
    void display() {
        System.out.println("name: " + name);
        System.out.println("year: " + year);
        System.out.println("sales: " + sales);
    }
    public static void main(String args[]) {
        System.out.println("Enter details of 5 Sales Records: ");
        SalesRecord sales[] = new SalesRecord[5];
        for (int i = 0; i < 5; i++) {
            sales[i] = new SalesRecord();
            sales[i].input();
        }
        
        System.out.println("Employee data in desecnding order of year");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (sales[j].year < sales[j + 1].year) {
                    SalesRecord temp = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            sales[i].display();
        }
    }

}