package threads.souljava;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class CountThreads {
    public static void main(String[] args) {
        var counter = new AtomicInteger();

        while (true) {
            var thread = new Thread(() -> {
                int threadsCount = counter.getAndIncrement();
                System.out.printf(
                        Locale.US, "started %,d\tthreads %,d%n",
                        threadsCount, Thread.currentThread().getId()
                );
                LockSupport.park();
            });
            thread.start();
        }
    }
}
