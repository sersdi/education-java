import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileWork {
    static void main(String[] args) {
        File directory = new File("folder5");
        directory.mkdir();
        File file = new File(directory,"text5.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw")){
            randomAccessFile.seek(5000);        //seek позволяет перемещаться к необходимой нам позиции
            byte[]array = new byte[1024];            //создаем массив байт
            randomAccessFile.read(array);            //считываем начиная с позиции seek инфы на  1024 байта
            System.out.println(new String(array));   //выводим инфу превращая массив с данными в стринг
            randomAccessFile.seek(0);
            randomAccessFile.read(array);
            System.out.println(new String(array));
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
