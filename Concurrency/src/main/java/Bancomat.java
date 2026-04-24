public class Bancomat {
    private int money = 1_000_000;
    public final Object monitor = new Object();
    public void cash(String name, int summa){
        synchronized (monitor){
            System.out.println(name+" Podoshel k bankomaty");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(money>=summa){
                money = money - summa;
                System.out.println(name+" Vivel "+summa+" rub."+" V bankomate ostalos "+money+" rub.");
            } else {
                System.out.println("V bankomate nedostatochno deneg dlya "+name+".");
            }
        }
    }
}
