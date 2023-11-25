import java.io.Console;

public class StringPalindrome {
    public static void main(String[] args) {
        Console c = System.console();
        String str = c.readLine("Enter a string: ");
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        if (str.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
