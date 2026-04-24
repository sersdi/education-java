import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private static Calculator calculator;              //создали переменную экземпляра класса

    @BeforeAll
    public static void setUp() {               //методы с аннотацией @Before вызываются перед каждым тестом
        calculator = new Calculator();        //вызвали такой метод, что бы не создавать каждый раз в методах объект класса
    }

    @Test                                              //ПРОВОДИМ ТЕСТИРОВАНИЕ МЕТОДА
    //В expected ожидаемый результат в result реальное значение переменных
    public void whenAddTenToFiveThenResultFifteen() {
        int expected = 15;
        int result = calculator.add(10, 5);
        assertEquals(expected, result);
    }

    @Test
    public void when10AddTo10AsStringThenResult20() {
        double expected = 20;
        double result = calculator.add("10", "10");
        assertEquals(expected, result, 0.001);       //delta - погрешность в типе double указываем что бы не влияло на ответ(слишком маленькая погрешность мы её обнуляем до тысячных)
    }

//    @Test(expected = Exception.class)
//    public void whenInputIncorrectValueThenThrowException(){
//        calculator.add("asd", "40");
//    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        boolean wasException = false;                               //для boolean выражений
        try {
            calculator.add("asd", "40");
        } catch (Exception e) {                                    //ловим исключение
            wasException = true;
        }
        assertTrue(wasException);                               //assertTrue для boolean
    }

    @Test
    public void whenAddOneHandedToFifteenThenResultOneHandedFifteen() {          //Образец как принято вызывать методы тестов
        int expected = 150;
        int result = calculator.add(100, 50);
        assertEquals(expected, result);
    }

    @Test
    void multiply() {
        double expected = 100;
        double result = calculator.multiply(10, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    void division() {
        double expected = 50;
        double result = calculator.division(100, 2);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void when100AsStringDivision2AsStringResult50(){
        double expected = 50;
        double result = calculator.division("100","2");
        assertEquals(expected, result, 0.001);
    }

    @Test
    void squared() {
        int expected = 25;
        int result = calculator.squared(5);
        assertEquals(expected, result);
    }

    @AfterAll                                //методы с аннотацией @AfterAll будет вызываться после каждого теста
    public static void close() {
        //calculator = null;
    }

}