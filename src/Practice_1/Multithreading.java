package Practice_1;

class MyThread1 extends Thread{
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My gaming Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("Thread 2 for gaming is slow");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Multithreading
{
public static void main(String[] args) 
{
	MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
}
}
