import java.io.*;
//  Теория
//Для побайтового чтения данных используется абстрактный класс InputStream
//Метод read возвращает значение прочитанного байта в пределах от 0 до 255 или -1 если данных в потоке больше нет
//Для чтения данных из файла используется наследник InputStream - FileInputStream
//Try с ресурсами автоматически освобождает ресурсы по завершении операции для этого предаваемый обьект должен реализовывать интерфейс Closeable

public class Main {
    public static void main(String[] args) {
        File file = new File("1.txt");  //Создаем обьект памяти файл
        try {
            file.createNewFile();          //Создаем файл и оборачиваем
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //чтобы упростить написание(не писать как внизу комментарии) создаем поток данных в блоке try с ресурсами
        //В блоке try с ресурсами можно использовать любой класс который реализует интерфейс Closeable
        try(InputStream inputStream = new FileInputStream(file)) { //после завершения работы с потоком он сам закроется(Потому что абстрактный класс InputStream реализует интерфейс Closeable)
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e){
                throw new RuntimeException();
            }
        }




    }


//        InputStream inputStream = null;                     //создаем ссылку на стрим не в потоке трай кеч(чтобы можно было обратиться из блока finaly(блок выполняется в любом случаем даже при выбросе исключения))
//        try {
//            inputStream = new FileInputStream(file);            //Создаем поток данных(байт)После завершения работы с потоком надо вызвать метод close в finaly
//            int a = inputStream.read();                                     //read() читает 1 байт и возвращает его значение типа int(0-255)Когда данные в файле заканчиваются(возвращает-1)
//            while (a != -1){
//                System.out.print((char) a);     //тк читали символы можем сделать явное привидение к char
//                a = inputStream.read();
//            }
//        } catch (Exception e) {                                             //Что бы не создавать много блоков с ловлей исключений(ловим род класс Exception)
//            throw new RuntimeException(e);
//        } finally {
//            if(inputStream != null){
//                try {
//                    inputStream.close();        //завершаем работу с потоком
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }



//        File directory = new File("folder/folder2/folder1");
//        File file1 = new File("folder/folder2/folder1/file1.txt");      //присваиваем переменным их путь
//        File file2 = new File("folder/folder2/folder1/file2.txt");
//        File file3 = new File("folder/folder2/folder1/file3.txt");
//        try {                       //оборачиваем в трай кеш тк может вылезти исключение(если файл или папка не создадутся)
//            directory.mkdirs();     //создаем несколько директорий(папок)
//            file1.createNewFile();  //создаём файл
//            file2.createNewFile();
//            file3.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        File[] files = directory.listFiles((dir, name)-> name.contains("1"));   //Создаем массив с файлами с фильтрацией
//        for(File f : files){
//            System.out.println(f.getName());
//        }