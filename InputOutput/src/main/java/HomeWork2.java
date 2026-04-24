
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class HomeWork2 {
    public static void main(String[] args) {
        File dirt = new File("folder2");
        dirt.mkdir();
        File file = new File("folder2/names2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(Reader reader = new InputStreamReader(new FileInputStream(file))){
            char[] array = new char[128];
            int count = reader.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0){
                result.append(new String(array,0, count));
                count = reader.read(array);
            }
            String[] names = result.toString().split(" ");
            List<String>filter = Arrays.stream(names)
                    .filter((s -> s.startsWith("A")))
                    .toList();
            System.out.println(filter);
        } catch (IOException e){
            throw new RuntimeException();
        }
    }
}
