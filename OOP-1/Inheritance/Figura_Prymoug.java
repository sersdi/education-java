package Inheritance;

public class Figura_Prymoug extends Figura {
    Figura_Prymoug(double a, double b){
        super(a, b);
    }

    @Override
    public double getPerimetr() {
        return (getA()+getB())*2;
    }
}


