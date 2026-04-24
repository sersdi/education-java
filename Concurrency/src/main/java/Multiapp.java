public class Multiapp {
    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();
    private int c = 0;
    private int c1 = 0;

    public void print(int page){
        synchronized (monitor1){
            while (this.c!=page){
                try {
                    this.c+=1;
                    monitor1.wait(500);
                    System.out.println("Printed "+this.c+" pages");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void scan(int page){
        synchronized (monitor2){
            while (this.c1!=page){
                try {
                    this.c1+=1;
                    monitor2.wait(500);
                    System.out.println("Scanned "+this.c1+" pages");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Multiapp multiapp = new Multiapp();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                multiapp.scan(3);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                multiapp.print(3);
            }
        });
        thread1.start();
        thread2.start();
    }



}
