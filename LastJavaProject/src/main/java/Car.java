import java.io.Serializable;

@FunctionalInterface
public interface Car extends Serializable {
    public final int SPEED = 10;

    void go();

    default void stop(){
        System.out.println("Car stopped");
    }

    static void printSpeed(){
        System.out.println("Speed: " + SPEED);

    }
}
