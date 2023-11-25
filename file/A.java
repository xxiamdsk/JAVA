package file;

class A {
    void m1() {
        System.out.println("this is default method from class A");
    }

    public void m2() {
        System.out.println("this is public method from class A");
    }

    protected void m3() {
        System.out.println("this is protected method from class A");
    }

    private void m4() {
        System.out.println("this is private method from class A");
    }

    public static void main(String args[]) {
        System.out.println("I'm in class A");
    }
    
}
