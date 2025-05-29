package multithreading;

//Demonstrates basic multithreading using Thread class
public class SimpleThread extends Thread{
	private final String name;

    public SimpleThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread running: " + name);
    }

    public static void runExample() {
        Thread t1 = new SimpleThread("Thread-1");
        Thread t2 = new SimpleThread("Thread-2");

        t1.start();
        t2.start();
    }
}
