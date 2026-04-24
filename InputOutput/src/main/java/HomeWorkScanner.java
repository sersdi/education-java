import java.io.*;

import java.util.Scanner;

public class HomeWorkScanner {
    public static void main(String[] args) {
        File directory = new File("folder3");
        File file = new File(directory, "names3.txt");

        try(OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name:");
            String next = scanner.nextLine();
            while(!next.equals("Exit")){
                outputStream.write(next.getBytes());
                System.out.println("Enter name:");
                next = scanner.nextLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try(InputStream inputStream = new FileInputStream(file)) {
            byte[] array = new byte[128];
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();
            while (count>0) {
                result.append(new String(array,0,count));
                count = inputStream.read(array);
            }
            System.out.println("In file: "+result);
        } catch (Exception e){
            throw new RuntimeException();
        }


    }
}
