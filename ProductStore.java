import java.io.*;

class ProductStore {

    int slno, price, discount;
    String proName, ProCompany;

    void input(int i) {
        Console c = System.console();
        slno = i;
        System.out.println();
        System.out.println("Serial number: " + slno);
        proName = c.readLine("Product Name : ");
        ProCompany = c.readLine("Product Company Name : ");
        price = Integer.parseInt(c.readLine("Product Price : "));
        discount = (price * 10) / 100;
    }

    void display() {
        System.out.println("Product Name: " + proName);
        System.out.println("Prduct Company: " + ProCompany);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
    }

    public static void main(String args[]) {
        Console c = System.console();
        ProductStore ob[] = new ProductStore[5];

        System.out.println("Enter the details of 5 Products");
        for (int i = 1; i < 3; i++) {
            ob[i - 1] = new ProductStore();
            ob[i - 1].input(i);

        }

        System.out.print("Enter Serial number for serach result: ");
        int i = Integer.parseInt(c.readLine());
        ob[i - 1].display();

    }
}