import java.io.*;
//  Теория
// Класс String иммутабельный (неизменяемый), поэтому если вам нужно формировать строку в цикле, прикрепляя к ней новые символы, то нужно использовать класс StringBuilder
// Если нужно делать тоже самое но из разных потоков тогда стоит использовать класс StringBuffer
// Читать по одному байту очень долгая операция поэтому лучше использовать чтение в массив
// Если нужно читать символы, а не байты тогда можно использовать Reader который в качестве параметра в конструктор принимает InputStream Ему по желанию можно указать кодировку
public class FileWork {
    public static void main(String[] args) {
        File directory = new File("folder1");
        directory.mkdir();
        File file = new File(directory,"names.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (InputStream inputStream = new FileInputStream(file)){
            byte[] array = new byte[8];                             //передаем байты в массив так программа будет считывать байты быстрее(обычно передаются значения байт кратным 1024)
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();             //Класс StringBuilder нужен если нужно формировать строку из каких нибудь кол-во символов или строк (String не подходит тк он не изменяемый(иммутабельный))
            while (count > 0){                                      //Класс StringBuffer такой-же как и StringBuilder но потокобезопасен и его методы синхронизированы(с ним можно работать из разных потоков)
                result.append(new String(array, 0, count));     //создали строку из массива байт (offset-отступ, count-колво элементов из которых будем формировать строку)
                count = inputStream.read(array);                    //снова считываем массив байт
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
