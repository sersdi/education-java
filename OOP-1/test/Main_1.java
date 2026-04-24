package test;

import examples.Person;

import java.util.Random;

public class Main_1 {
    public static void main(String[] args) {
        Person p = new Person("Sergey", 24);
        System.out.println(p.toString());       //переопределили метод тустринг в классе person теперь выводится не hashcode а наши переменные метод тустринг вызывается под копотом поэтому его явно не прописываем

        Random random = new Random();
        for(int i =0; i<100; i++){
        int a = random.nextInt(5,11);
        System.out.print(a+" ");
        }
    }
}
