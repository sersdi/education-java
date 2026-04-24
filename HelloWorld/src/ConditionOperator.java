public class ConditionOperator {
    public static void main(String[] args) {
        int money = 30;
        if (money >= 50) {
            System.out.println("Пицца");
        } else if (money >= 30) {
            System.out.println("Бургер");
        } else {
            System.out.println("Ничего");
        }
    }
}