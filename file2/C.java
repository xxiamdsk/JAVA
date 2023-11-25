package file2;

class C {
    void m1() {
        System.out.println("this is default method from class C");
    }

    public void m2() {
        System.out.println("this is public method from class C");
    }

    protected void m3() {
        System.out.println("this is protected method from class C");
    }

    private void m4() {
        System.out.println("this is private method from class C");
    }
    public static void main(String[] args) {
        System.out.println("I'm in class C");
    }
    
}
