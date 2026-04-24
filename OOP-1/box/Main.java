package box;

public class Main {
    public static void main(String[] args) {                    // КОМБИНАЦИЯ ДЛЯ КРАСОТЫ КОДА CTRL+ALT+L

        Box box1 = new Box(15, 15, 15);
        Box box2 = new Box(20, 20, 20);
        Box box3 = new Box(40);
        Box box4 = new Box(box3);
        Box box5 = box1.copy();
        Box box6 = box2.increase();

        box1.showVolume();
        box2.showVolume();
        box5.showVolume();
        box6.showVolume();

        WeightBox box7 = new WeightBox(40, 40, 40, 100);
        box7.showInfo();


    }
}
