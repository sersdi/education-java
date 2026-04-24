package HomeWork.TryCatch;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int c =0; c<10 ;c++){
            a.add(c);
        }
        System.out.println(a);
        try {
            System.out.println(a.get(11));
        } catch (Exception e) {
            System.out.println("Вышли за предел массива");
        }
    }

}
