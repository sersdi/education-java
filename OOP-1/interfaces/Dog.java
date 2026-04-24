package interfaces;

public class Dog extends Animal implements AbleToRun,AbleToSwim {          //ПОДКЛЮЧАЕМ ИНТЕРФЕЙС МОЖНО ПОДКЛЮЧАТЬ СКОЛЬКО УГОДНО ИНТЕРФЕСОВ УКАЗЫВАТЬ ЧЕРЕЗ ЗАПЯТУЮ

    @Override                                           //ЭТОТ МЕТОД ПЕРЕОПРЕДЕЛЕН ИЗ РОДИТЕЛЯ
    public void eat() {
        System.out.println("Кушаю кость");

    }
    @Override
    public void run(){                                   //ЭТОТ МЕТОД ПЕРЕОПРЕДЕЛЕН ИЗ интерфейса
        System.out.println("Собака бежит");
    }

    @Override
    public void swim() {
        System.out.println("Cобака может плавать");

    }
}
