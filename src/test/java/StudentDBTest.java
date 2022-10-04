import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    public void getAllStudents() {
        //given
        Student student = new Student(5, "peter");
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
        Student student = new Student(5, "peter");
        HashMap<Integer, Student> students = new HashMap<>(Map.of(student.getId(),student));
        StudentDB studentdb = new StudentDB(students);
        //when
        String actual = studentdb.toString();
        //then
        String expected = "StudentDB{allStudents={5=Studenten{id=5, name='peter'}}}";
        assertEquals(expected, actual);

    }


    @Test
    void findByIdReturnsObject() {
        //given
        int id = 5;
        Student student = new Student(5, "peter");
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