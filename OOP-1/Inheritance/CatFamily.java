package Inheritance;

public class CatFamily {

    protected int legs;                         //МОДИФИКАТОР PROTECTED позволяет получить доступ к переменной родителя у классов наследников
    protected int eyes;                         //ТАКЖЕ МОДИФИКАТОР ДАЕТ ДОСТУП КЛАССАМ КОТОРЫЕ БУДУТ ВНУТРИ ПАКЕТА ОБРАЩАТЬСЯ К ПЕРЕМЕННЫМ
    protected boolean canEatPerson;

    public CatFamily(){};      //создали пустой конструктор чтобы не писать явно конструктор в классах наследниках super

    public CatFamily(int eyes, int legs, boolean canEatPerson) {
        this.eyes = eyes;
        this.legs = legs;
        this.canEatPerson = canEatPerson;
    }

    public void eat(){
        System.out.println("Кушаю");
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }

    public int getEyes() {                                  //ГЕТТЕРЫ ДЛЯ КЛАССА МЭЙН ЕСЛИ НЕ В ПАКЕТЕ
        return eyes;
    }

    public boolean isCanEatPerson() {
        return canEatPerson;
    }

    public int getLegs() {
        return legs;
    }
}
