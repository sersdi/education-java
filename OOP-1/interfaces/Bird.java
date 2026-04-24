package interfaces;

public class Bird extends Animal implements AbleToFly,AbleToRun{

    @Override
    public void eat() {
        System.out.println("Кушаю птичий корм");
    }

    @Override
    public void fly() {
        System.out.println("Птица может летать");

    }

    @Override
    public void run() {
        System.out.println("Птица может бегать");

    }
}
