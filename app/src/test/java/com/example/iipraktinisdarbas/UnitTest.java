
package com.example.iipraktinisdarbas;

        import org.junit.Test;

        import static org.junit.Assert.*;

        import com.example.iipraktinisdarbas.utils.ElementsCalculator;

public class UnitTest {
    //tikrinama, kai neįvedamas joks tekstas. Jei tektas neįvedamas, testas teigiamas, nei ne - neveikia.
    @Test
    public void Test_Given_EmptyString_When_getCharsCount_IsCalled() {
        String givenString = ""; //jei įrašytume char, testas fail'intų, nes tikisi 0
        int expectedResult = 0;
        int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_Given_EmptyString_When_getWordsCount_IsCalled() {
        String givenString = ""; //jei įrašytume žodį, testas fail'intų
        int expectedResult = 0;
        int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_Given_EmptyString_When_getNumbersCount_IsCalled() {
        String givenString = "1"; //jei įrašytume skaičių, testas fail'intų
        int expectedResult = 0;
        int actualResult = ElementsCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }


    //tikrinama, kai neįvedamas joks tekstas. Jei tektas neįvedamas, testas teigiamas, nei ne - neveikia.
    @Test
    public void Test_Given_String_When_getCharsCount_IsCalled() {
        String givenString = "abc"; //jei neįrašytume 3 char (daugiau ar mažiau), testas fail'intų
        int expectedResult = 3;
        int actualResult = ElementsCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Test_Given_String_When_getWordsCount_IsCalled() {
        String givenString = "labas vakaras"; //jei įrašytume ne du žodžius, testas fail'intų
        int expectedResult = 2;
        int actualResult = ElementsCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Test_Given_String_When_getNumbersCount_IsCalled() {
        String givenString = "1 2 345"; //jei įrašytume ne 5 skaičius, testas fail'intų
        int expectedResult = 5;
        int actualResult = ElementsCalculator.getNumbersCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
    //

}
