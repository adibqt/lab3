package Tests;

import org.junit.jupiter.api.Test;
import tasks.FizzyPrinter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzyPrinterTest {
    @Test
    void testFizz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Fizz", fizzyPrinter.printFizzy(3, false));
    }
    @Test
    void testBuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Buzz", fizzyPrinter.printFizzy(5, false));
    }
    @Test
    void testBang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("Bang", fizzyPrinter.printFizzy(7, false));
    }
    @Test
    void testFizzBuzz() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("FizzBuzz", fizzyPrinter.printFizzy(15, false));
    }
    @Test
    void testFizzBuzzBang() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("FizzBuzzBang", fizzyPrinter.printFizzy(105, false));
    }
    @Test
    void testFizzUpperCase() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        assertEquals("FIZZ", fizzyPrinter.printFizzy(3, true));
    }

}
