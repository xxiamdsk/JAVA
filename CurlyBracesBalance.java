import java.io.*;

public class CurlyBracesBalance {
    public static void main(String[] args) {
        int count = 0;
        Console c = System.console();
        String str = c.readLine("Enter a File name: ");
        int len = str.length();
        String s = str.substring(len - 5, len);
        if (s.equals(".java")) {
            System.out.println("File name is valid");
            try {
                FileReader f = new FileReader(str);
                int i;
                while ((i = f.read()) != -1) {
                    if ((char) i == '{') {
                        count++;
                    } else if ((char) i == '}') {
                        count--;
                    }
                }
                if (count == 0) {
                    System.out.println("Curly braces are balanced");
                } else {
                    System.out.println("Curly braces are not balanced");
                }
                f.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("IO execption found");
            }
        } else {
            System.out.println("File name is not valid");
        }

    }
}
