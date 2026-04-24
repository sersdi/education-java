package Inheritance;

public class Figura_Treug extends Figura {

    private double c;

    Figura_Treug(double a, double b, double c){
        super(a, b);
        this.c = c;
    }

    public final double getC() {            //FINAL геттеры нельзя переопределить в наследниках
        return c;
    }

    @Override
    public double getPerimetr() {
        return getA()+getB()+getC();
    }


}
