package file;

class B {
    void m1() {
        System.out.println("this is default method from class B");
    }

    public void m2() {
        System.out.println("this is public method from class B");
    }
    
    protected void m3() {
        System.out.println("this is protected method from class B");
    }

    private void m4() {
        System.out.println("this is private method from class B");
    }
    public static void main(String[] args) {
        System.out.println("I'm in class B");
    }
    
}
