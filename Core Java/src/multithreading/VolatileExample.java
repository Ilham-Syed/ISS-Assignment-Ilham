package multithreading;

//Class demonstrating use of volatile keyword
class VolatileFlagRunner implements Runnable {
 // Volatile ensures visibility of changes across threads
 private volatile boolean running = true;

 public void run() {
     while (running) {
         // Simulating work with a busy-wait loop
     }
     System.out.println("Thread stopped.");
 }

 // Changes running to false, visible to other threads immediately
 public void stop() {
     running = false;
 }
}

public class VolatileExample {
	public static void runExample() throws InterruptedException {
        VolatileFlagRunner task = new VolatileFlagRunner();
        Thread thread = new Thread(task);
        thread.start();

        // Let the thread run for a bit
        Thread.sleep(1000);

        // Stop the thread using volatile variable
        task.stop();

        // Wait for thread to end
        thread.join();
    }
}
