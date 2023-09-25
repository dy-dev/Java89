import java.util.HashMap;
import java.util.Map;

public class Student {
    private String m_sName;
    private Map<String, Integer> m_GradesMap;

    public String getName() {
        return m_sName;
    }

    public void setName(String p_sName) {
        m_sName = p_sName;
    }

    public Map<String, Integer> getGradesMap() {
        return m_GradesMap;
    }

    public Student(String p_sName) {
        m_sName = p_sName;
        m_GradesMap = new HashMap<>();
    }

    public void setGrade(String p_sSubject, int p_iGrade) {
        m_GradesMap.put(p_sSubject, p_iGrade);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ")
                .append(m_sName)
                .append(" has following grades : \n");
        for (var entry : m_GradesMap.entrySet()) {
            sb.append("\t- ")
                    .append(entry.getKey())
                    .append(" -> ")
                    .append(entry.getValue())
                    .append("\n");
        }
        return sb.toString();
    }

    public void setGrades(Map<String, Integer> p_GradesMap) {
        m_GradesMap = p_GradesMap;
    }
}
