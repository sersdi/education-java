package MyCollection;


import java.util.HashSet;

// КОМБИНАЦИЯ ДЛЯ КРАСОТЫ КОДА CTRL+ALT+L
public class Main {
    public static void main(String[] args) {
        HashSet<String> names = getEmployees();             //КОЛЛЕКЦИЯ HASHSET ХРАНИТ В СЕБЕ ЭЛЕМЕНТЫ БЕСПОРЯДОЧНО В ОТЛИЧИИ ОТ ARRAYLIST
        for (String s : names) {                            //В ЭТОЙ КОЛЛЕКЦИИ НЕЛЬЗЯ ОБРАЩАТЬСЯ К ЭЛЕМЕНТАМ ПО ИНДЕКСУ
            System.out.println(s);                          //Поэтому пользуемся только методом for each для вывода элементов
        }                                                   //HASHSET не может хранить одинаковых элементов
    }
    private static HashSet<String> getEmployees(){
        HashSet<String> employees = new HashSet<>();
        employees.add("John");
        employees.add("Emma");
        employees.add("Bob");
        employees.add("Sofa");
        employees.add("Sergey");
        employees.add("Mark");
        return employees;
    }
}



//        MyArrayList employees = getEmployees();
//        employees.add("James");
//        employees.remove("Emma");
//        for(int i = 0; i < employees.getSize(); i++){
//            System.out.println(employees.get(i));
//        }
//
//    }
//
//    private static MyArrayList getEmployees(){             // private static метод на который нельзя ссылаться
//        MyArrayList employees = new MyArrayList();
//        employees.add("John");
//        employees.add("Olivia");
//        employees.add("Emma");
//        employees.add("Rob");
//        employees.add("Bob");
//        employees.add("Sergey");
//        return employees;
//    }






