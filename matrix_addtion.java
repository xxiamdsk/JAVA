import java.io.Console;

public class matrix_addtion {
    static Console c = System.console();
    static int row = Integer.parseInt(c.readLine("Enter number of rows : "));
    static int col = Integer.parseInt(c.readLine("Enter number of cols : "));
    static int arr[][] = new int[row][col];
    static int arr2[][] = new int[row][col];
    static int arr3[][] = new int[row][col];

    public static void main(String[] args) {
        matrix_addtion ob = new matrix_addtion();
        ob.input();
        ob.output();
        ob.add();

    }

    void input() {
        System.out.println("Enter the element of first array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.parseInt(c.readLine("Enter the element arr[" + i + "][" + j + "] : "));

            }
        }
        System.out.println("Enter the element of second array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = Integer.parseInt(c.readLine("Enter the element arr[" + i + "][" + j + "] : "));

            }
        }
    }

    void output() {
        System.out.println("Your first array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }

        System.out.println("Your second array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.print("\n");
        }
    }

    void add() {
        System.out.println("Addtion of two martix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr3[i][j] = (arr[i][j] + arr2[i][j]);
                System.out.print(arr3[i][j] + " ");

            }
            System.out.print("\n");
        }

    }
}
