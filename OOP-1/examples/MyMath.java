package examples;

public class MyMath {                           //ПЕРЕГРУЗКА МЕТОДОВ
    private static final double PI = 3.14;      // const пишем заглавными и final - присвоить значение переменной можно только 1 раз, только при её создании

    public static int sum(int... numbers){      //varargs(...) аргументы переменной длины
        int sum = 0;
        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }

    public static double length (double radius){
        return 2*PI*radius;
    }

    public static int multiple(int a, int b){              //STATIC означает что метод статичный(не работает с элементами класса) его можно вызывать не создавая обьекты данного класса
        return a*b;
    }
    public static double multiple(double a, double b){
        return a*b;
    }
    public static int multiple(int a){
        return a*a;
    }
}
