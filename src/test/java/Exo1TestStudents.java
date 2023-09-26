import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exo1TestStudents {

    @Test
    void createGrades() {
        Random random = new Random();
        List<Student> studentList = new ArrayList<>();
        String mathSubject = "Maths";
        String javaSubject = "Java";
        int maxStudent = 3;
        for (int i = 0; i < maxStudent; i++) {
            Student student = new Student("Student" + i);
            student.setGrade(mathSubject, random.nextInt(0,20));
            student.setGrade(javaSubject, random.nextInt(0,20));
            studentList.add(student);
        }
        int gradeMath1 = studentList.get(0).getGradesMap().get(mathSubject);
        int gradeMath2 = studentList.get(maxStudent-1).getGradesMap().get(mathSubject);

        Exo1Students ex = new Exo1Students(studentList);
        ex.Invert();

        assertEquals(ex.getStudentList().get(0).getGradesMap().get(mathSubject), gradeMath2);
        assertEquals(ex.getStudentList().get(maxStudent-1).getGradesMap().get(mathSubject), gradeMath1);
    }
}