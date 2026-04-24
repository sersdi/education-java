package examples;

public class Dog {
    String name;
    String poroda;
    double wight;
    int speed;

    String info(){
        return name + " " + poroda + " " + wight;
    }

    void run(){
        for(int i = 0;i<speed;i++){
            System.out.println("Бегу");
        }
    }


}
