class delay extends Thread {
   
    public void run() {
        
        for (int i = 0; i <=10; i++) {
            System.out.println("2*"+i+"="+i*2);
            try{Thread.sleep(800);}
            
            catch(InterruptedException e){}
        }
    }
    public static void main(String[] args) {
        delay ob1 = new delay();
        ob1.start();
       
    }
    
}
