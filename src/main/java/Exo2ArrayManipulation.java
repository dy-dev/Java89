import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exo2ArrayManipulation {
    private int[][] m_Arrays;

    public Exo2ArrayManipulation() {
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
        return checkContent();
    }

    private String checkContent() {
        StringBuilder sb = new StringBuilder("Thank you, among your arrays we can find\n");
        for (int i = 0; i < m_Arrays[0].length; i++) {
            final int finalI = i;
            if (Arrays.stream(m_Arrays[1]).anyMatch(e -> e == m_Arrays[0][finalI])
                    && Arrays.stream(m_Arrays[2]).anyMatch(e -> e == m_Arrays[0][finalI])) {

                //Using stream and List of Integer to find with java function the index we are
                //looking for

//                System.out.println(list.indexOf(Integer.valueOf(m_Arrays[0][finalI])));
                sb.append("Number ").append(m_Arrays[0][finalI]).append(" at indexes\n");

                for (int j = 0; j < 3; j++) {
                    List<Integer> list = Arrays.stream(m_Arrays[j])
                            .mapToObj(Integer::valueOf)
                            .collect(Collectors.toList());
                    sb.append("\t------> ").
                            append(list.indexOf(Integer.valueOf(m_Arrays[0][finalI])))
                            .append(" of array ")
                            .append(j + 1)
                            .append(",\n");
                }


                //Using a straightforward, old fashion way loop to find the index
                //we are looking for
//                for (int a = 0; a < m_Arrays[1].length;a++) {
//                    if(m_Arrays[1][a] == m_Arrays[0][finalI])
//                        System.out.println(a);
//                }
            }
        }
        return sb.toString();
    }
}
