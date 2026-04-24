package interfaces;

public class Lion extends Animal implements AbleToRun,AbleToSwim{      //ПОДКЛЮЧАЕМ ИНТЕРФЕЙС

    @Override
    public void eat() {                                 //ЭТОТ МЕТОД ПЕРЕОПРЕДЕЛЕН ИЗ РОДИТЕЛЯ
        System.out.println("Кушаю свежее мясо");

    }
    @Override
    public void run(){                                  //ЭТОТ МЕТОД ПЕРЕОПРЕДЕЛЕН ИЗ интерфейса
        System.out.println("Лев бежит");
    }

    @Override
    public void swim() {
        System.out.println("Лев может плавать");
    }
}
