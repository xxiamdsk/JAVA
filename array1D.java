import java.io.Console;

class Array1D {
    static Console c = System.console();
    static int n = Integer.parseInt(c.readLine("Enter size of array : "));
    static int arr[] = new int[n];

    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(c.readLine("Enter value of arr[" + i + "] : "));
        }

        System.out.println("Your array is ");
        for (int index = 0; index < n; index++) {
            System.out.print(arr[index] + " ");

        }

    }
}
