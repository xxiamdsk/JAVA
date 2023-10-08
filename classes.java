class Class {
    Class() {
        System.out.println("class classes called");
    }

    Class(int a) {
        System.out.println("single parameterised called");
    }

}

class classes {
    public static void main(String[] args) {
    Class ob = new Class();
    Class ob1 = new Class(5);

    }

}
