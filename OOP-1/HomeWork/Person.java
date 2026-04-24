package HomeWork;

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

    public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
        String name = s.substring(8, 12);
        int age = Integer.parseInt(s.substring(20,22));

        Person p1 = new Person(name,age);
        System.out.println(p1.getName()+" "+p1.getAge());

    }

}
