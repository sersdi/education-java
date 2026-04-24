import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

// Класс Semaphore управляет доступом к общему ресурсу с помощью счетчика.
// Если значение счётчика больше нуля - доступ разрешен, если равно нулю, то в доступе будет отказано

public class ConcurrencyPart12 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphore = new Semaphore(3);   //Класс семафор нужен, что бы ограничить доступ к какому-то ресурсу в скобках указываем сколько потоков мы допускаем. В данном коде мы указали что в данную секцию не может войти больше 3 потоков
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    String name = Thread.currentThread().getName();
                    System.out.println(name +" started working.");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        semaphore.acquire();            //метод, который отнимает у счётчика единицу. Когда будет 0, потоки остановятся и будут ждать когда он увеличится на 1
                        workWithFileSystem();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {                        // в блоке файнали так как если вызовут у потока интерапт, программа провалится в файнали, поэтому пишем release() всегда в блоке finally, что бы потоки работали
                        semaphore.release();           //метод, который увеличивает счетчик на 1,что бы потоки начали работать дальше
                    }
                    System.out.println(name +" finished working.");
                }
            });
        }
        executorService.shutdown();         //Выключаем потоки(отключаем ожидание у потоков и завершаем их работу)
    }

    private static void workWithFileSystem(){
        String name = Thread.currentThread().getName();
        System.out.println(name +" started working with file system.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name +" finished working with file system.");
    }
}
