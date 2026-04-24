package HomeWork.multithreading;

import java.util.Random;

public class Main {
    static int chislo1;
    static int chislo2;

    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random();
        chislo1 = random1.nextInt(1_000_000);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0;i<1_000_000_000;i++){
                    chislo2 = random2.nextInt(1_000_000);
                    System.out.println("Число загаданное: "+chislo1+" Число подобранное: "+chislo2);
                    if(chislo1==chislo2){
                        System.out.println("CОВПАДЕНИЕ НАЙДЕНО: "+chislo1+" "+chislo2);
                        break;
                    }
                }
            }
        });
        thread.start();
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i > 0; i++){
                    System.out.println("Прошло секунд: "+i);
                    try {
                        thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                    if(chislo1==chislo2){
                        System.out.println("Время остановлено. Прошло секунд: "+i+"c");
                        break;
                    }
                }
            }
        });
        timer.start();



    }
}
