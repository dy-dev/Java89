import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo2TestArrays {
    @Test
    void fillFirstArrays() {
        Exo2ArrayManipulation ex = new Exo2ArrayManipulation();
        String ret = ex.setArray(new int[][]{
                {5, 1, 2, 3, 36},
                {},
                {}});
        assertEquals(ret, "Warning your array contains a number greater than 10");
    }

    @Test
    void fillSecondArrays() {
        Exo2ArrayManipulation ex = new Exo2ArrayManipulation();
        String ret = ex.setArray(new int[][]{
                {5, 1, 2, 3, 10},
                {6, 7, 8, 8, 5},
                {}});
        assertEquals(ret, "Warning number must be distinct");
    }

    @Test
    void fillThirdArrays() {
        Exo2ArrayManipulation ex = new Exo2ArrayManipulation();
        String ret = ex.setArray(new int[][]{
                {5, 2, 3, 9, 10},
                {2, 7, 8, 9, 5},
                {4,1,2,5,3}});
        assertEquals(ret, "Thank you, among your arrays we can find\n" +
                "Number 5 at indexes\n" +
                "\t------> 0 of array 1,\n" +
                "\t------> 4 of array 2,\n" +
                "\t------> 3 of array 3,\n" +
                "Number 2 at indexes\n" +
                "\t------> 1 of array 1,\n" +
                "\t------> 0 of array 2,\n" +
                "\t------> 2 of array 3,\n");
    }
}