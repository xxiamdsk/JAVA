import java.io.*;

public class FileCopyCopy {
    public static void main(String[] args) {
        try {
            Console c = System.console();
            // String str = c.readLine("Enter a file name: ");
            FileReader f = new FileReader("text.txt");
            // String str1 = c.readLine("Enter a file name to copy: ");
            FileWriter fw = new FileWriter("text2.txt");

            int i;
            while ((i = f.read()) != -1) {
                fw.write(i);

            }
            System.out.println("File copied successfully");
            f.close();
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO execption found");
        }
    }
}
