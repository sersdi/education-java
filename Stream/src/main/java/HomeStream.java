import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int random = ((int)(Math.random()*100+100));
            numbers.add(random);
        }
        System.out.println(numbers);

        List<String> filteredlist = numbers.stream()
                .filter((integer -> integer % 2 == 0 && integer % 5 == 0))
                .map(Math::sqrt)
                //.map((sqrt) -> "Sqrt: "+sqrt)
                .map(HomeStream::mapToString)
                .collect(Collectors.toList());

        System.out.println(filteredlist);

    }
    private static String mapToString(double a){
        return "Sqrt: "+ a;
    }
}
