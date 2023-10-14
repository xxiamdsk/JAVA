public class StaticNonStatic {
    static int num = 5;
    int num1 = 10;

    static void m() {
        System.out.println("static function from staticNonStatic Class");
    }

    public static void main(String[] args) {
        StaticNonStatic ob = new StaticNonStatic();
        System.out.println(num);
        System.out.println(ob.num1);
        m();

    }

}
