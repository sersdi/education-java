package Inheritance;

public class Main {
    public static void main(String[] args) {

        Figura_Treug treug = new Figura_Treug(20,20,20);
        Figura_Prymoug prymougolnik = new Figura_Prymoug(5,10);
        Figura_Treug_Color blackTreug = new Figura_Treug_Color(2,2,2);
        treug.showPerimetr();
        prymougolnik.showPerimetr();
        blackTreug.showPerimetr();

//        Cat cat = new Cat();
//        Lion lion = new Lion();
//        System.out.println(cat.eyes);
//        System.out.println(lion.eyes);
//        cat.eat();          //для кота метод переопределён и для льва тоже
//        lion.eat();


    }
}
