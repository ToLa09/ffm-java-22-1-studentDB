import org.junit.jupiter.api.Test;
import students.ComputerScienceStudent;
import students.Student;
import students.StudentDB;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    public void getAllStudents() {
        //given
        ComputerScienceStudent student = new ComputerScienceStudent(5, "peter", "Berlin", 71283, "java");
        HashMap<Integer, Student> students = new HashMap<>(Map.of(student.getId(),student));
        StudentDB studentdb = new StudentDB(students);
        //when
        HashMap<Integer, Student> actual = studentdb.getAllStudents();
        //then
        assertEquals(students, actual);
    }

    @Test
   void studentToString() {
        //given
        ComputerScienceStudent student = new ComputerScienceStudent(5, "peter", "Berlin", 71283, "java");
        HashMap<Integer, Student> students = new HashMap<>(Map.of(student.getId(),student));
        StudentDB studentdb = new StudentDB(students);
        //when
        String actual = studentdb.toString();
        //then
        String expected = "students.StudentDB{allStudents={5=students.ComputerScienceStudent{programmingLanguages='java'} students.Student{id=5, name='peter'}}}";
        assertEquals(expected, actual);

    }


    @Test
    void findByIdReturnsObject() {
        //given
        int id = 5;
        ComputerScienceStudent student = new ComputerScienceStudent(5, "peter", "Berlin", 71283, "java");
        HashMap<Integer, Student> students = new HashMap<>(Map.of(student.getId(),student));
        StudentDB studentdb = new StudentDB(students);

        //when
        Student actual = studentdb.findById(id);

        //then
        assertEquals(student,actual);
    }

    @Test
    void addStudent() {}
}