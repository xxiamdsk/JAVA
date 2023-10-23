interface Shape {
    void accept();
    void area();
}
class Square implements Shape {
    public void area() {
        System.out.println("square area called");
    }
    public void accept() {
        System.out.println("square accept called");
    }
}
class Rectangle implements Shape {
    public void accept() {
        System.out.println("rectangle accept called");
    }

    public void area() {
        System.out.println("rectangle area called");
    }
}
class InterfaceArea {
    public static void main(String[] args) {
        Shape f = new Square();//indirect object creating of interface Shape
        f.accept();
        Square ob = new Square();
        Rectangle ob1 = new Rectangle();
        ob.accept();
        ob.area();
        ob1.accept();
        ob1.area();
    }
}
