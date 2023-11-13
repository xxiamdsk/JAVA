class Class {
    Class() {
        System.out.println("class classes called");
    }

    Class(int a) {
        System.out.println("single parameterised called");
    }

    void Class1()
    {
        System.out.println("Method Class1 called! ");
    }
}

class classes {
    public static void main(String[] args) {
    Class ob = new Class();
    Class ob1 = new Class(5);

    ob.Class1();
    ;
    ob1.Class1();
    }

}
