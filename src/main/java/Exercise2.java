import java.util.Arrays;

public class Exercise2 {
    private int[][] m_Arrays;

    public Exercise2() {
        m_Arrays = new int[3][5];
    }

    public String setArray(int[][] p_IntArray) {
        m_Arrays = p_IntArray;
        int i = 1;
        for (var arr : m_Arrays) {
            System.out.println("Please Enter 5 distinct numbers for array " + (i++));
            if (Arrays.stream(arr).anyMatch(e -> e > 10)) {
                return "Warning your array contains a number greater than 10";
            }
            if (Arrays.stream(arr).distinct().count() != Arrays.stream(arr).count()) {
                System.out.println("Warning number must be distinct");
                return "Warning number must be distinct";
            }
        }
        String ret = "Thank you, among your arrays we can find\n";
        System.out.println(ret);

        ret += checkContent();
        return ret;
    }

    private String checkContent() {
        for (int i = 0; i < m_Arrays[0].length; i++) {
            final int finalI = i;
            if (Arrays.stream(m_Arrays[1]).anyMatch(e -> e == m_Arrays[0][finalI])
                    && Arrays.stream(m_Arrays[2]).anyMatch(e -> e == m_Arrays[0][finalI])) {
                for (int a = 0; a < m_Arrays[1].length;a++) {
                    if(m_Arrays[1][a] == m_Arrays[0][finalI])
                        System.out.println(a);
                }
            }
        }
        return null;
    }
}
