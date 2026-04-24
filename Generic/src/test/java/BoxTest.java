import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoxTest {

    @Test
    public void testBox(){
        List<Integer> numbers = new ArrayList<>();
        Box.method(numbers);
    }

    @Test
    public void testTransfer(){
        List<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers1.add(i);
        }
        List<Number> numbers2 = new ArrayList<>();
        Box.transfer(numbers1, numbers2);
        assertEquals(10, numbers2.size());
        assertEquals(0, numbers1.size());




    }



}