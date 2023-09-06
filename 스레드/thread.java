public class thread {
  public static void main(String[] args) {

    Runnable th1 =new syssys();
    Runnable th2 =new syssys();
    Runnable th3 =new syssys();

    thread foo1 = new thread(th1);
    thread foo2 = new thread(th2);
    thread foo3 = new thread(th3);
    

    foo1.start();
    foo2.start();
    foo3.start();
    
  }

}

