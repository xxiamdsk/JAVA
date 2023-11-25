public class ThrowExp {
    void m1() {
        System.out.println("hii...");
    }

    public static void main(String[] args) throws Exception {
        ThrowExp ob = new ThrowExp();
        try {
            ob.m1();
        } catch (Exception e) {
            System.out.println("error come out ");
        }

    }

}
