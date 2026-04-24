
public class MainBancomat {
    public static void main(String[] args) {
        Bancomat bancomat1 = new Bancomat();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bancomat1.cash("Sofa",300_000);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bancomat1.cash("Sergey",500_000);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                bancomat1.cash("Petya",600_000);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
