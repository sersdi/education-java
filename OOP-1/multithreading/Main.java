package multithreading;                 //МНОГОПОТОЧНОСТЬ

public class Main {

    static boolean isFive = false;//СДЕЛАЛИ ПРЕМЕННУЮ ЭКЗЕМПЛЯРА КЛАССА А НЕ ЛОКАЛЬНУЮ В МЕТОДЕ MAIN ТК ПОТОКИ НЕ МОГУТ МЕНЯТЬ ЗНАЧЕНИЯ ЛОКАЛЬНЫХ ПЕРЕМЕННЫХ В MAIN а могут только брать изначальное значение локальной переменной пока метод main работает(как только метод мейн запустит потоки, main перестанет работать, а потоки продолжат работать какое-то свое время, которое мы указали)
    //статик переменная будет существовать столько же времени как класс MAIN
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {     //АНОНИМНЫЙ ЭКЗЕМПЛЯР КЛАССА ИНТЕРФЕЙСА RUNNABLE
            @Override
            public void run() {
                for(int i =0; i<10_000_000; i++){
                    if (i == 5){
                        isFive = true;
                    }
                    System.out.println(i);
                    try {                                 //УСЫПЛЕНИЕ ПОТОКА .sleep статичный метод Каждую секунду будет засыпать
                        Thread.sleep(1000);         // CTRL+ATL+T ОБЕРНУТЬ В ЦИКЛЫ(TRY CATCH)
                    } catch (InterruptedException e) {

                    }
                }
            }
        });                                                 //Thread - поток
        thread.start();
        Thread thread2 = new Thread(new Runnable() {       //СОЗДАЕМ ВТОРОЙ ПОТОК
            @Override
            public void run() {
                for(int i =0; i<10_000_000; i++){
                    if(isFive){
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        });
        thread2.start();

    }
}
