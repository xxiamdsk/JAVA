import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            Console c = System.console();
            String str = c.readLine("Enter a file name: ");
            FileReader f = new FileReader("text.txt");
            // String str1 = c.readLine("Enter a file name to copy: ");
            FileWriter fw = new FileWriter("text2.txt");

            int i;
            while ((i = f.read()) != -1) {
                char ch=(char) i;
                switch(ch){
                    case '0':
                        fw.write(ch);
                        break;
                    case '1':
                        fw.write(ch);
                        break;
                    case '2':
                        fw.write(ch);
                        break;
                    case '3':
                        fw.write(ch);
                        break;
                    case '4':
                        fw.write(ch);
                        break;
                    case '5':
                        fw.write(ch);
                        break;
                    case '6':
                        fw.write(ch);
                        break;
                    case '7':
                        fw.write(ch);
                        break;
                    case '8':
                        fw.write(ch);
                        break;
                    case '9':
                        fw.write(ch);
                        break;
                    default:
                        break;
                }
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
