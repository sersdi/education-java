package test;
//import examples.MyMath;
//import examples.Person;
                                                // КОМБИНАЦИЯ ДЛЯ КРАСОТЫ КОДА CTRL+ALT+L
public class Main {
    public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
        String name = s.substring(8, 12);   //Последний индекс в обрезку не входит поэтому надо выбирать на 1 индекс больше нужного
        System.out.println(name);


    }

}

//        String[] employess = getEmployees();                //создали список стринг работники и присвоили значения из метода getEmployees()
//        String[] newArray = new String[employess.length+1]; // создали новый массив с длиной на 1 больше чем в предыдущем списке
//        for (int i = 0; i < employess.length;i++){          //цикл который по индексу присваивает значения из 1 списка во второй
//            newArray[i] = employess[i];
//        }
//        newArray[newArray.length-1] = "James";              //добавляем переменную на последнее место в новом списке по индексу
//        employess = newArray;                               // списку 1 присваиваем значения списка 2
//        employess[0] = null;                                // в списке нулевому элементу присваиваем значения null(удаляем его)
//        String[] newestArray = new String[employess.length - 1];    //создаем 3 список, который будет короче на 1 элемент
//        for(int i = 0, j = 0; i < employess.length; i++){           //цикл в котором работаем с элементами 3 списка, в условии i < длины 1 списка
//            String employee = employess[i];                 //создали переменную которой придаем значение из списка 1
//            if (employee!=null){                            //проверяем если переменная не равна null то в список 3 по индексу передаем значение из 1 списка
//                newestArray[j] = employee;                  // работаем с 3 списком через ещё одну переменную j
//                j++;                                        // переменная счетчик
//            }
//        }
//        employess = newestArray;                  // списку 1 присвоили список3
//        for(String employee : employess){         //создали цикл в котором переменной стринг работник присваиваем значения из списка 1
//            System.out.println(employee);         // выводим элемент списка
//        }
//    }
//
//    private static String[] getEmployees(){             // private static метод на который нельзя ссылаться
//        String[] employees = new String[6];             // код выше показывает как работать со списком когда нельзя напрямую изменять private методы
//        employees[0] = "John";                          // код выше удалил 1 работника и добавил ещё одного в конце
//        employees[1] = "Olivia";
//        employees[2] = "Emma";
//        employees[3] = "Rob";
//        employees[4] = "Bob";
//        employees[5] = "Sergey";
//        return employees;
//    }



//        System.out.println(MyMath.sum(22,3,5));


//        Person person = new Person("Jake", 23);
//        person.setAge(-10);
//        System.out.println("Name: "+person.getName()+" Age: "+person.getAge());             //Для вывода инфы обращаемся к геттерам и сеттерам тк поля класса private



//        box.Box box1 = new box.Box(15,15,15);
//        box.Box box2 = new box.Box(20,20,20);
//        box.Box box3 = new box.Box(40);
//        box.Box box4 = new box.Box(box3);
//        box.Box box5 = box1.copy();
//        box.Box box6 = box2.increase();
//
//        box1.showVolume();
//        box2.showVolume();
//        box5.showVolume();
//        box6.showVolume();
//
//        int result1 = box3.compare(box2);
//        int result2 = box4.compare(box3);
//        System.out.println(result1);
//        System.out.println(result2);



//        examples.Monster m1 = new examples.Monster();
//        m1.voice();
//        m1.voice(2);
//        m1.voice(3,"AYEEEEE");


//        box.Box box1 = new box.Box(20);
//        box1.showVolume();

//        System.out.println(examples.MyMath.multiple(25.2,30.2));       //вызываем статичный метод из класса math
//        System.out.println(Math.sin(30));                           //используем пакет джавы

//        examples.Rabotnick r1 = new examples.Rabotnick("Sergey","Programer",150_000);
//        r1.showInfo();


//        examples.Rect r1 = new examples.Rect();
//        r1.setDimens(12,20);
//        System.out.println(r1.ploshad());


//        examples.Test t = new examples.Test();
//        System.out.println(t.square(30));


//        examples.Dog dog1 = new examples.Dog();
//        dog1.name = "Sharik";
//        dog1.poroda = "Ovcarka";
//        dog1.wight = 32;
//        dog1.speed = 10;
//        System.out.println(dog1.info());
//        dog1.run();
//
//        examples.Dog dog2 = new examples.Dog();
//        dog2.name = "Reks";
//        dog2.poroda = "Pitbul";
//        dog2.wight = 64;
//        dog2.speed= 20;
//        String info = dog2.info();
//        System.out.println(info);
//        dog2.run();


//        examples.Human h1 = new examples.Human();
//        h1.wight = 67;
//        h1.age = 35;
//        h1.name = "Pavel";
//
//        examples.Human h2 = new examples.Human();
//        h2.wight = 57;
//        h2.age = 32;
//        h2.name = "Sasha";
//
//        examples.Human h3 = new examples.Human();
//        h3.wight = 67;
//        h3.age = 27;
//        h3.name = "Sergey";


//        int sred = (h1.wight + h2.wight + h3.wight) / 3;
//        System.out.println(sred);


//    }
//}
