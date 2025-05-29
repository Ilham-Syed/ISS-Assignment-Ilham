package multithreading;

public class Main {
 public static void main(String[] args) throws InterruptedException {
     System.out.println("\n--- Simple Thread Example ---");
     SimpleThread.runExample();

     System.out.println("\n--- Synchronization Example ---");
     Synchronization.runExample();

     System.out.println("\n--- Thread Pool Example ---");
     ThreadPoolExample.runExample();

     System.out.println("\n--- Thread Safe vs Non-Thread Safe Example ---");
     ThreadSafe.runExample();

     System.out.println("\n--- Volatile Keyword Example ---");
     VolatileExample.runExample();
 }
}
