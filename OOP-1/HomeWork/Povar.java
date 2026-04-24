package HomeWork;

public class Povar implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Povar работает");
    }
    @Override
    public void drive() {
        System.out.println("Повар водит");
    }

}
