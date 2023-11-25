import java.io.*;
class FIleRead {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("File.java");
            int i;
            while ((i = f.read()) != -1) {
                 System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO execption found");
        }
    }
} 