public class constructoroverloading {
    constructoroverloading() {
        System.out.println("Default cons called");
    }

    constructoroverloading(int a) {
        System.out.println("Single arg cons called");
    }

    constructoroverloading(int a, int b) {
        System.out.println("double args cons called");

    }

    constructoroverloading(int a, String c) {
        System.out.println("diff type args cons called");

    }

    constructoroverloading(String c, int a) {
        System.out.println("diff sequence args cons called");

    }

    public static void main(String[] args) {
        new constructoroverloading();
        new constructoroverloading(2);
        new constructoroverloading(2, 3);
        new constructoroverloading(3, "deepak");
        new constructoroverloading("deepak", 2);
    }
}
