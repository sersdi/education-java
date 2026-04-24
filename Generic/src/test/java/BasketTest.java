import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    @Test
    public void Basket(){
        Apple apple = new Apple();
        Orange orange = new Orange();

        Basket<Apple> apples = new Basket<>();
        Basket<Orange> oranges = new Basket<>();
        Basket<Fruit> applesAndOranges = new Basket<>();

        apples.add(apple);
        oranges.add(orange);
        applesAndOranges.add(apple);
        applesAndOranges.add(orange);
        assertEquals(1,apples.getWeight());
        assertEquals(1.5,oranges.getWeight());
        assertEquals(2.5,applesAndOranges.getWeight());

        assertEquals(1, applesAndOranges.compare(oranges));

        Basket.transfer(oranges, applesAndOranges);
        Basket.transfer(apples, applesAndOranges);
        assertEquals(5, applesAndOranges.getWeight());
    }
}
