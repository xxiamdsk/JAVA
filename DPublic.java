import file.*; 

public class DPublic {
    
    void m1() {
        System.out.println("this is default method from public class D");
    }

    public void m2() {
        System.out.println("this is public method from public class D");
    }

    protected void m3() {
        System.out.println("this is protected method from public class D");
    }

    private void m4() {
        System.out.println("this is private method from public class D");
    }

    public static void main(String[] args) {
        System.out.println("I'm in public class D");
        
        // can access A class because it is public
        APublic.main(args);

        // can't access B class because it is default
        // B ob1 = new B();
        // ob1.main(args);
    }

}
