package file;
public class APublic{
    void m1(){
        System.out.println("this is default method from public class A");
    }
    public void m2(){
        System.out.println("this is public method from public class A");
    }
    protected void m3(){
        System.out.println("this is protected method from public class A");
    }
    private void m4(){
        System.out.println("this is private method from public class A");
    }

    public static void main(String args[]){
        System.out.println("I'm in public class A");
    }
}
