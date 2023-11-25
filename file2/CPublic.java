package file2;

public class CPublic {
    void m1() {
        System.out.println("this is default method from public class C");
    }

    public void m2() {
        System.out.println("this is public method from public class C");
    }

    protected void m3() {
        System.out.println("this is protected method from public class C");
    }

    private void m4() {
        System.out.println("this is private method from public class C");
    }
public static void main(String[] args) {
    System.out.println("I'm in public class C");
}    
}
