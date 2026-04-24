
import java.util.*;
import java.util.stream.Stream;

public class UserMain {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 25));
        users.add(new User("Sergey", 18));
        users.add(new User("John", 59));
        users.add(new User("Ember", 64));
        users.add(new User("Lina", 23));
        users.add(new User("Lion", 62));
        users.add(new User("Crystal", 98));
        users.add(new User("Pharaoh", 30));         //Класс optional обертка(контейнер) нужен, что бы методы, которые возвращают тип данных optional работали даже если в контейнере не было значений
                                                            //все методы из stream api которые возвращают не поток данных являются терминальными(завершающий)

                                                                    //Способы создания стримов
        users.stream()
                .filter(user1 -> user1.getName().contains("L")).findFirst()
                .ifPresentOrElse(System.out::println, ()-> System.out.println("User not found"));


        Stream.of(5, 4, 3, 2, 1)
                .filter((integer -> integer>3));



        int[] array2 = {1,2,3,4,5,6};
        Arrays.stream(array2)
                .filter(integer-> integer%2==0)
                .forEach(System.out::println);
    }

    //                                                  Теория по СТРИМАМ

// Некоторые методы(поиск элемента, получение макс и мин значения)возвращают тип optional
// Тип optional - контейнер для результата он может содержать или не содержать значения
// Что бы получить значение из optional, нужно вызвать метод get, предварительно сделав проверку через isPresent либо
//          используя функциональный стиль через метод ifPresent или ifPresentOrElse
// Способы создания стримов:
//      1. Метод stream или parallelStream у коллекций
//      2. Статический метод stream у класса Arrays для преобразования массива в поток данных
//      3. Статические методы класса Stream - of, generate и другие.
//  Метод parallelStream создает параллельный поток данных,
//      один поток разбивается на несколько участков, операции над каждым участком выполняются одновременно,
//      после чего поток снова склеивается. Это позволяет некоторые операции делать быстрее.





}
