public class Account {
    private int amount1;
    private int amount2;

    private final Object monitor1 = new Object();
    private final Object monitor2 = new Object();

    public Account(int amount1, int amount2){
        this.amount1 = amount1;
        this.amount2 = amount2;
    }

    public void transferFrom1to2(int amount){
        synchronized (monitor1){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(amount <= amount1){
                synchronized (monitor2){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    amount1 -= amount;
                    amount2 += amount;
                }
            } else{
                System.out.println("Insufficient funds in amount1");
            }
        }

    }
    public void transferFrom2to1(int amount){
        synchronized (monitor2){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(amount <= amount2){
                synchronized (monitor1){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    amount2 -= amount;
                    amount1 += amount;
                }
            } else{
                System.out.println("Insufficient funds in amount2");
            }
        }

    }


    public static void main(String[] args) {
        Account account = new Account(1000,1000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                account.transferFrom1to2(300);
                System.out.println("Thread1:"+account.amount1);
                System.out.println("Thread1:"+account.amount2);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                account.transferFrom2to1(500);
                System.out.println("Thread2:"+account.amount1);
                System.out.println("Thread2:"+account.amount2);
            }
        }).start();



    }

}
