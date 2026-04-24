package box;

public class Box {
    protected double length;
    protected double wight;
    protected double height;

    public Box() {                       // в классе можно создавать сколько угодно конструкторов(если мы не проставим значения в мейне при создании класса то из этого конструктора установиться значение 10)
        this(10, 10, 10);
    }

    public Box(Box another) {
        this(another.length, another.wight, another.height);
    }

    public Box(double length, double wight, double height) {     //конструктор (джава по умолоч их создает сели мы их не прописываем и заполняет значениями по умолочанию)
        this.length = length;
        this.height = height;
        this.wight = wight;
    }

    public Box(double size) {                   //Конструктор который вызывает другой конструктор этого класса и передает значение параметра в него
        this(size, size, size);

    }


    public void setDimens(double length, double wight, double height) {       //МЕТОД УСТАНОВКИ знач. вместо него сделали конструктор что бы авто при создании обьекта типа бокс происходила устанвока значений
        this.length = length;
        this.height = height;
        this.wight = wight;
    }

    public int compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        } else if (anotherVolume > currentVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    private double getVolume() {
        return length * wight * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    public void showInfo() {
        System.out.println("Lenght: " + length + " Wight: " + wight + " Height: " + height);
    }

    public Box copy() {
        return new Box(this.length, this.wight, this.height);
    }

    public Box increase() {
        return new Box(this.length * 2, this.wight * 2, this.height * 2);
    }


}
