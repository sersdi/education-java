package Inheritance;

public abstract class Figura {              //АБСТРАКТНЫЙ КЛАСС НЕЛЬЗЯ ВЫЗВАТЬ В МЕЙН И СОЗДАТЬ ОБЬЕКТ ТАКОГО КЛАССА ОН ЧИСТО РОДИТЕЛЬ ДЛЯ ДРУГИХ КЛАССОВ
    private double a;                       //ЕСЛИ ВМЕСТО МОДИФИКТОРА ABSTRACT УКАЗАТЬ FINAL ТО ТОГДА ОТ ЭТОГО КЛАССА НЕЛЬЗЯ НАСЛЕДОВАТЬСЯ
    private double b;

    Figura(double a,double b){
        this.a = a;
        this.b = b;

    }

    public final double getB() {        //FINAL геттеры нельзя переопределить в наследниках
        return b;
    }

    public final double getA() {        //FINAL геттеры нельзя переопределить в наследниках
        return a;
    }

    public abstract double getPerimetr();   //АБСТРАКТНЫЙ МЕТОД ОЗНАЧАЕТ ЧТО КАЖДЫЙ НАСЛЕДНИК КЛАССА ДОЛЖЕН ПЕРОПРЕДЕЛИТЬ ЭТОТ МЕТОД

    public final void showPerimetr(){       //FINAL методы нельзя переопределить в наследниках
        System.out.println(getPerimetr());
    }




}
