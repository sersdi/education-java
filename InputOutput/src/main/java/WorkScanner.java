import java.io.*;
import java.util.Scanner;
//                                         Теория

 //                               Чтение/запись байтов                  Чтение/запись символов

 //   Абстракция                inputStream/OutputStream                Reader/Writer

 //   Работа с файлами        FileInputStream/FileOutputStream          FileReader/FileWriter

 //   Использование буфера    BufferedInputStream/BufferedOutputStream  BufferedReader/BufferedWriter
//    для ускорения процесса
//    чтения/записи
 //
 //                      InputStreamReader/OutputStreamWriter - оболочки для InputStream/OutputStream

public class WorkScanner {
    public static void main(String[] args) {
        File directory = new File("folder3");
        File file = new File(directory, "names3.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Result a+b: "+(a+b));

    }
}




