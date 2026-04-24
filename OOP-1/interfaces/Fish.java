package interfaces;

public class Fish extends Animal implements AbleToSwim{

    @Override
    public void eat() {                             //ЭТОТ МЕТОД ПЕРЕОПРЕДЕЛЕН ИЗ РОДИТЕЛЯ
        System.out.println("Кушаю рыбий корм");
    }

    @Override
    public void swim() {
        System.out.println("Рыба может плавать");

    }
}
