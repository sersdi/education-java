package HomeWork;

import java.util.Random;

public class Kubick {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i<100;i++){
            int a = random.nextInt(1,7);
            System.out.printf("Ваше число: %s ", a);
            System.out.println();
        }

    }
}
