import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class CollectionOfNumbers {                                      //Обычные коллекции не потокобезопасны
    public static void main(String[] args) {                            //Что бы создать потокобезопасную из обычной нужно воспользоваться статическими методами из класса Collections - synchronizedList, synchronizedSet и synchronizedMap
        List<Integer> numbers = new CopyOnWriteArrayList<>();           //Если нужна более оптимизированная коллекция, то стоит использовать коллекции из пакета concurrent
        CountDownLatch countDownLatch = new CountDownLatch(2);          //CopyOnWriteArrayList CopyOnWriteArraySet ConcurrentHashMap
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 50 ; i++) {
                        Thread.sleep(100);
                        numbers.add(i);
                    }
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 50 ; i++) {
                        Thread.sleep(100);
                        numbers.add(i);
                    }
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(numbers.size());
        for (int number : numbers) {
            System.out.println(number);
        }



    }
}
