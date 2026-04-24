package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
            int c = Integer.parseInt("fasd");
        } catch (ArithmeticException e1){
            System.out.println("Делить на ноль нельзя");

        } catch (Exception e) {
            System.out.println("Поймано исключение "+e.getClass());
        }
        System.out.println("Hello");
    }
}
