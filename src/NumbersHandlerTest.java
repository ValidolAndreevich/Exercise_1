import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NumbersHandlerTest {

    NumbersHandler handler = new NumbersHandler();

    @Test
    void averageMethodGetsEmptyList() {
        final double expResult = 0;
        double actResult = handler.findAverageCurrent();
        assertEquals(expResult,actResult);
    }

    @Test
    void averageMethodGetsNotEmptyList() {
        handler.addNumberToList("0");
        handler.addNumberToList("3");
        handler.addNumberToList("-7");
        handler.addNumberToList("2.5");
        handler.addNumberToList("-1.5");
        final double expResult = -0.6;
        double actResult = handler.findAverageCurrent();
        assertEquals(expResult,actResult);
    }

    @Test
    void getLargestCurrentNumber() {
        handler.addNumberToList("-32");
        handler.addNumberToList("-32.001");
        handler.addNumberToList("0");
        handler.addNumberToList("47");
        handler.addNumberToList("47.001");
        final double expResult = 47.001;
        double actResult = handler.getLargestCurrentNumber();
        assertEquals(expResult,actResult);
    }

    @Test
    void getSmallestCurrentNumber() {
        handler.addNumberToList("-1.001");
        handler.addNumberToList("-0.001");
        handler.addNumberToList("0");
        handler.addNumberToList("0.5");
        handler.addNumberToList("17.001");
        final double expResult = -1.001;
        double actResult = handler.getSmallestCurrentNumber();
        assertEquals(expResult,actResult);
    }

    @Test
    void exceptionOnStringAdd() {
        String input = "some invalid value";
        assertDoesNotThrow(() -> handler.addNumberToList(input));
    }
}