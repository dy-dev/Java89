import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {
    @Test
    void fillFirstArrays() {
        Exercise2 ex = new Exercise2();
        String ret = ex.setArray(new int[][]{
                {5, 1, 2, 3, 36},
                {},
                {}});
        assertEquals(ret, "Warning your array contains a number greater than 10");
    }

    @Test
    void fillSecondArrays() {
        Exercise2 ex = new Exercise2();
        String ret = ex.setArray(new int[][]{
                {5, 1, 2, 3, 10},
                {6, 7, 8, 8, 5},
                {}});
        assertEquals(ret, "Warning number must be distinct");
    }

    @Test
    void fillThirdArrays() {
        Exercise2 ex = new Exercise2();
        String ret = ex.setArray(new int[][]{
                {5, 2, 3, 9, 10},
                {2, 7, 8, 9, 5},
                {4,1,2,5,3}});
        assertEquals(ret, "Thank you, among your arrays we can find\n");
    }
}