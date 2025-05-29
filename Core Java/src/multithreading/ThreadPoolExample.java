package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Demonstrates using a thread pool executor
public class ThreadPoolExample {
	public static void runExample() {
        // Fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Task to be executed by threads
        Runnable task = () -> {
            System.out.println("Task executed by: " + Thread.currentThread().getName());
        };

        // Submit multiple tasks
        for (int i = 0; i < 5; i++) {
            executor.submit(task);
        }

        // Gracefully shutdown executor
        executor.shutdown();
    }

}
