package multithreading;

//Class with both thread-safe and non-thread-safe methods
class SharedResource {
 private int sharedCount = 0;

 // Not thread-safe: multiple threads can corrupt data
 public void incrementUnsafely() {
     sharedCount++;
 }

 // Thread-safe: synchronized ensures only one thread at a time
 public synchronized void incrementSafely() {
     sharedCount++;
 }

 public int getSharedCount() {
     return sharedCount;
 }
}

//Demonstrates difference between thread-safe and non-thread-safe operations
public class ThreadSafe {
	public static void runExample() {
        SharedResource resource = new SharedResource();

        // Runnable using synchronized increment
        Runnable safeTask = () -> {
            for (int i = 0; i < 1000; i++) {
                resource.incrementSafely();
            }
        };

        Thread t1 = new Thread(safeTask);
        Thread t2 = new Thread(safeTask);
        t1.start(); t2.start();

        // Wait for threads to complete
        try {
            t1.join(); t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output should be 2000 if thread-safe
        System.out.println("Thread-safe count: " + resource.getSharedCount());
    }

}
