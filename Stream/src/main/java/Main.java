
//          ()-> лямбда выражение(АНОНИМНЫЙ МЕТОД) ВОЗМОЖНО ТОЛЬКО С ФУНКЦИОНАЛЬНЫМИ ИНТЕРФЕЙСАМИ
//          ФУНКЦИОНАЛЬНЫЕ ИНТЕРФЕЙСЫ - ЭТО ИНТЕРФЕЙСЫ С ОДНИМ АБСТРАКТНЫМ МЕТОДОМ

//                                                           Нужно запомнить:
//                1. Все операторы по работе со стримами делятся на два типа: промежуточные и завершающие(терминальные)
//                2. Терминальные операторы завершают работу потока(stream)
//                3. Промежуточных операторов в потоке может быть сколько угодно, терминальный только один
//                4. Терминальный оператор запускает на выполнение промежуточные операторы
//
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 1000);
            numbers.add(random);
        }
        System.out.println(numbers);

        List<String> list = numbers.stream()                       //Преобразовываем коллекцию в поток данных
                .filter((n) -> n % 2 == 0)                  // Фильтруем поток данных оставляя только четные числа
                .map((integer -> "Number: " + integer))     //Каждое число преобразуется в строку
                .filter((string) -> string.endsWith("0"))    //Остаются строки в конце "0"
                .map((string)-> string + "!")                //Добавляем в конце строк !
                .collect(Collectors.toList());                     //терминальный оператор(завершающий) Поток стрим запуститься на выполнение (Этот поток данных в терминальном операторе преобразуется в List и сохраняется в переменную list)

        for(String s : list){
            System.out.println(s);
        }

    }
//
//    private static List<String> map(List<Integer> list){
//        List<String>filteredList = new ArrayList<>();
//        for(int number : list){
//            filteredList.add("Number: "+number);
//        }
//        return filteredList;
//    }
//
//    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
//        List<Integer> filteredList = new ArrayList<>();
//        for(int s : list){
//            if(predicate.test(s)){
//                filteredList.add(s);
//            }
//        }
//        return filteredList;
//    }


}


