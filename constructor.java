
public class constructor {
    constructor() {
        System.out.println("Constructor Called");
    }

    constructor(int n) {
        System.out.println("Second Constructor Called");
    }

    public static void main(String[] args) {
        new constructor();
        new constructor(5);
    }
}
