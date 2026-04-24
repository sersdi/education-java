import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkCatMain {
    public static void main() {
        File file = new File("cats.cts");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<HomeWorkCat> catsArray = new ArrayList<HomeWorkCat>();
        catsArray.add(new HomeWorkCat("Borka","Bulgog",1.5));
        catsArray.add(new HomeWorkCat("Evka","Bulgog",2.5));
        catsArray.add(new HomeWorkCat("Orka","Bulgog",3.5));
        catsArray.add(new HomeWorkCat("Imka","Bulgog",8.5));
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){                // Cериализация
            objectOutputStream.writeObject(catsArray);
        } catch(Exception e){
            e.printStackTrace();
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            List<HomeWorkCat> savedCat = (List<HomeWorkCat>) objectInputStream.readObject();
            for(HomeWorkCat cat : savedCat){
                System.out.println(cat.getClichka());
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
