import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HomeWork1 {
    public static void main(String[] args) {
        String path = "folder1/folder2/folder3";
        File directory = new File(path);
        List<File> files = new ArrayList<>();
        files.add(new File(path + "/A1.txt"));
        files.add(new File(path + "/A2.txt"));
        files.add(new File(path + "/A3.txt"));
        files.add(new File(path + "/B1.txt"));
        files.add(new File(path + "/B2.txt"));
        files.add(new File(path + "/B1.txt"));
        try {                       //При создании файлов(папок и файлов) всё оборачиваем в блок трай кэш
            directory.mkdirs();     //Метод mkdirs() создает несколько папок
            for (File f : files) {  //Метод createNewFile создаёт файл
                f.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] filter = directory.listFiles((dir, name) -> name.startsWith("A"));   //Метод listFiles фильтрует файлы через 2 параметра(путь файла и его имя)
        for(File f : filter){
            System.out.println(f.getAbsoluteFile());        //Метод getAbsoluteFile выводит полный путь файла
        }



    }
}
