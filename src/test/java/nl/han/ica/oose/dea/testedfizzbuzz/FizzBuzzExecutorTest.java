package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {

    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest() {
        // Act
        var testValue = sut.execute(37);

        // Assert
        Assertions.assertEquals("37", testValue);
    }

    @Test
    void ThreeShouldBeFizz() {
        var testValue = sut.execute(3);
        Assertions.assertEquals("Fizz", testValue);
    }

    @Test
    void FiveShouldBeBuzz() {
        var testValue = sut.execute(5);
        Assertions.assertEquals("Buzz", testValue);
    }

    @Test
    void FifteenShouldBeFizzBuzz() {
        var testValue = sut.execute(15);
        Assertions.assertEquals("FizzBuzz", testValue);
    }
}