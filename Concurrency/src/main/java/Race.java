

import java.util.Map;
import java.util.concurrent.*;

public class Race {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphore = new Semaphore(3);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
        for (int i = 0; i < 10; i++) {
            Long time;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String name = Thread.currentThread().getName();
                    long millis = (long) ((Math.random() * 1000) + 5000);
                    long after = System.currentTimeMillis();
                    System.out.println(name+": Prepare to race");
                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        cyclicBarrier.await();
                        System.out.println(name+": Riding road");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        semaphore.acquire();
                        System.out.println(name+": Riding tunnel");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {semaphore.release();}
                    try {
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        System.out.println(name+": Riding road to finish");
                        Thread.sleep(millis);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    long before = System.currentTimeMillis();
                    long time = before-after;
                    System.out.println(name+" Finished: "+time);
                }
            });
        }
        executorService.shutdown();


    }

}
