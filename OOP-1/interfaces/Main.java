package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();
        ArrayList<AbleToRun> animals = new ArrayList<>();    //В ARRAYLIST можно указать интерфейс
        animals.add(lion);
        animals.add(dog);
        animals.add(bird);
        for(AbleToRun animal:animals){                  //В ЦИЦЛЕ ФОР ИЧ УКАЗЫВАЕМ ТИНТЕРФЕЙС
            animal.run();
        }
        bird.fly();
        fish.swim();

//        AbleToSwim fish1 = new Fish();
//        fish1.swim();


//        ArrayList<Animal> animals= new ArrayList<Animal>(); //для того что бы вывести сразу для всех обьектов один метод
//        animals.add(lion);                                  //ВЫПОЛНИЛИ АППКАСТ привели обьекты к родительскому типу
//        animals.add(dog);
//        animals.add(bird);
//        animals.add(fish);
//        for(Animal a :animals){
//            a.eat();
//        }

//        Animal animal = new Lion();         //ДЕЛАЕМ АПКАСТ обьект LION приводится к родительскому типу
//        animal.eat();
//        Lion lion = (Lion) animal;          //СДЕЛАЛИ ДАУНКАСТ ПРИВИДЕНИЕ К ДОЧЕРНЕМУ ТИПУ
//        lion.run();



    }
}
