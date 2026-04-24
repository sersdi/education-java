public class Boolean {
    public static void main(String[] args) {
        int temp = 30;
        boolean hot = temp >= 25;
        boolean cold = temp <= 15;
        int time = 21;
        boolean isNight = time > 23 || time < 6;
        if (hot && !isNight){
            System.out.println("Кондер включен");
        }
        else if (cold){
            System.out.println("Кондер выключен");
        }
        else {
            System.out.println("Кондер ничего не делает");
        }
    }
}
