class thread1 extends Thread{
  public void run() {
    System.out.println("thread1 is running");
  }
}

public class creating_Thread {
  public static void main(String[] args){
    thread1 t1=new thread1();
    thread1 t2=new thread1();
    t2.start();
    t1.start();
  }
}