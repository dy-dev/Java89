import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Exercise1 {
    private List<Student> m_StudentList;

    public Exercise1() {
        m_StudentList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Get student name : ");
            Student s = new Student(StarterClass.scan.nextLine());
            System.out.println("Get Math grade");
            s.setGrade("Math", StarterClass.scan.nextInt());
            System.out.println("Get Java grade");
            s.setGrade("Java", StarterClass.scan.nextInt());
            StarterClass.scan.nextLine();
            m_StudentList.add(s);
        }
        Invert();

        for (var stud : m_StudentList) {
            System.out.println(stud.toString());
        }
    }
    public Exercise1(List<Student> p_StudentList)
    {
        m_StudentList = p_StudentList;
    }
    public void setStudentList(List<Student> p_StudentList) {
        m_StudentList = p_StudentList;
    }
    public List<Student> getStudentList() {
        return m_StudentList;
    }

    public void Invert() {
        Student first = m_StudentList.get(0);
        Student last = m_StudentList.get(m_StudentList.size()-1);

        Map<String, Integer> grades = first.getGradesMap();
        first.setGrades(last.getGradesMap());
        last.setGrades(grades);
    }
}
