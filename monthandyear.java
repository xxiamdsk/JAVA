import java.io.*;

class monthandyear {
    public static void main(String[] args) {
        Console c = System.console();
        int m = Integer.parseInt(c.readLine("Enter your month number"));
        int y = Integer.parseInt(c.readLine("Enter your year "));

        switch (m) {
            case 1:
                System.out.println("Your month is JAN");
                System.out.println("Month has 31 days");
                break;
            case 2:
                if (y % 4 == 0) {
                    System.out.println("Your month is FEB");
                    System.out.println("Month has 29 days");
                }

                else {
                    System.out.println("Your month is FEB");
                    System.out.println("Month has 28 days");
                }

                break;
            case 3:
                System.out.println("Your month is MAR");
                System.out.println("Month has 31 days");
                break;
            case 4:
                System.out.println("Your month is APR");
                System.out.println("Month has 30 days");
                break;
            case 5:
                System.out.println("Your month is MAY");
                System.out.println("Month has 31 days");
                break;
            case 6:
                System.out.println("Your month is JUN");
                System.out.println("Month has 31 days");
                break;
            case 7:
                System.out.println("Your month is JUL");
                System.out.println("Month has 30 days");
                break;
            case 8:
                System.out.println("Your month is AUG");
                System.out.println("Month has 31 days");
                break;
            case 9:
                System.out.println("Your month is SEP");
                System.out.println("Month has 30 days");
                break;
            case 10:
                System.out.println("Your month is OCT");
                System.out.println("Month has 31 days");
                break;
            case 11:
                System.out.println("Your month is NOV");
                System.out.println("Month has 30 days");
                break;
            case 12:
                System.out.println("Your month is DEC");
                System.out.println("Month has 31 days");
                break;

            default:
                break;
        }

    }

}
