package file;

public class BPublic {
    void m1() {
        System.out.println("this is default method from public class B");
    }

    public void m2() {
        System.out.println("this is public method from public class B");
    }
    
    protected void m3() {
        System.out.println("this is protected method from public class B");
    }

    private void m4() {
        System.out.println("this is private method from public class B");
    }
    public static void main(String[] args) {
        System.out.println("I'm in public class B");

        BPublic ob1 = new BPublic();
        ob1.m1();//default method
        ob1.m2();//public method
        ob1.m3();//protected method
        ob1.m4();//private method

    }
}

 