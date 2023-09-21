import java.io.*;

public class array2D {
    static Console c = System.console();
    static int row = Integer.parseInt(c.readLine("Enter number of rows : "));
    static int col = Integer.parseInt(c.readLine("Enter number of cols : "));
    static int arr[][] = new int[row][col];

    public static void main(String[] args) {
        array2D ob = new array2D();
        ob.input();
        ob.output();

    }

    void input() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(c.readLine("Enter the element arr[" + i + "][" + j + "] : "));

            }
        }
    }

    void output() {
        System.out.println("Your array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }
    }
}