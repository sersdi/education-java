package examples;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if(age>=0) {
            this.age = age;
        }
        else{
            System.out.println("неверный возраст");
        }
    }

    public void setAge(int age){            //Метод сеттер нужен для того что бы изменять значения переменных с типом доступа private
        if(age>=0){this.age = age;}
        else {
            System.out.println("неверный возраст");
        }
    }

    public String getName(){          // Метод ГЕТТЕР для чтения значения полей
        return name;                  // Можно быстро писать геттеры и сеттеры через генератор на правую кнопку мыши
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Age: %s", name, age);
    }
}
