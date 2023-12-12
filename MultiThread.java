class MultiThread extends Thread {
    String j;

    MultiThread(String i) {
        j = i;
    }

    public void run() {
        System.out.println(j);
        for (int i = 0; i < 10; i++) {

            System.out.print(i);

        }
        // System.out.println(" ");
    }

    public static void main(String[] args) {
        MultiThread ob = new MultiThread("a");
        MultiThread ob1 = new MultiThread("b");
        MultiThread ob2 = new MultiThread("c");
        MultiThread ob3 = new MultiThread("d");
        MultiThread ob4 = new MultiThread("e");
        ob.start();
        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

    }
}