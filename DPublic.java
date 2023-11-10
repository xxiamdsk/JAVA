import file.*; 
public class DPublic {
    public static void main(String[] args) {
        System.out.println("I'm in class D");
        
        // can access A class because it is public
        APublic ob = new APublic();
        ob.main(args);

        // can't access B class because it is default
        // B ob1 = new B();
        // ob1.main(args);
    }

}
