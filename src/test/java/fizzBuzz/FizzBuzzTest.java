package fizzBuzz;

import org.example.fizzBuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void notFizzNorBuzzTest() {
        Assertions.assertEquals("1", FizzBuzz.convert(1));
    }

    @Test
    void fizzTest() {
        Assertions.assertEquals("Fizz", FizzBuzz.convert(3));
    }

    @Test
    void buzzTest() {
        Assertions.assertEquals("Buzz", FizzBuzz.convert(5));
    }

    @Test
    void fizzBuzzTest() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.convert(15));
    }


}
