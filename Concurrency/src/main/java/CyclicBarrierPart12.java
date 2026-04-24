import java.util.concurrent.CyclicBarrier;
public class CyclicBarrierPart12 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);         //ЦИКЛИЧИСКИЙ БАРЬЕР(счётчик когда доходит до 0, снова прибавляет по 1 каждый поток и ждет когда снова наберется указанное значение счётчика)
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long millis = (long)(Math.random()*5000+1000);
                    String name = Thread.currentThread().getName();
                    System.out.println(name+ ": Data is being prepared");
                    try {
                        Thread.sleep(millis);
                        System.out.println(name +": Data is ready");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name+": Continue work");
                }
            }).start();
        }

    }

}
