import java.io.Console;

class Record {
    static Console c = System.console();
    String name;
    int year;

    void input() {
        name = c.readLine("Enter the name: ");
        year = Integer.parseInt(c.readLine("Enter the year of production: "));
    }

    void show() {
        System.out.println("Name : " + name + "\nYear : " + year);
    }

    public static void main(String[] args) {
        Record s[] = new Record[5];

        for (int i = 0; i < 5; i++) {
            s[i] = new Record();
            s[i].input();
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (s[j].year > s[i].year) {
                    int temp = s[i].year;
                    s[i].year = s[j].year;
                    s[j].year = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            s[i].show();
        }
    }
}