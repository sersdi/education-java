import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        File directory = new File("folder5");
        File file = new File(directory,"text5.txt");
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")){
            byte[]pageText = new byte[3000];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or 'stop' to exit");
            while(true){
                int page = scanner.nextInt();
                randomAccessFile.seek((page-1) * pageText.length);
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText, 0, count));
                System.out.println("Enter next page or 'stop' to exit");
                if(scanner.hasNext("stop")){
                    System.out.println("Program stop");
                    break;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
