public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public double add(String a, String b){
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA+numB;
    }

    public double multiply(int a, int b){
        return a*b;
    }

    public double division(int a, int b){
        return a / b;
    }

    public double division(String a, String b){
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA / numB;
    }

    public int squared(int a){
        return a*a;
    }


}
