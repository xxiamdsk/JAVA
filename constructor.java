import java.io.Console;

public class constructor {
    constructor() {
        System.out.println("Constructor Called");
    }

    constructor(int n) {
        System.out.println("Second Constructor Called");
    }

    public static void main(String[] args) {
        constructor ob = new constructor();
        constructor ob1 = new constructor(5);
    }
}
