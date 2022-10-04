import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    public void getAllStudents() {
        //given
        Students student = new Students(5, "peter");
        ArrayList<Students> students = new ArrayList<>();
        students.add(student);
        StudentDB studentdb = new StudentDB(students);
        //when
        ArrayList<Students> actual = studentdb.getAllStudents();
        //then
        assertEquals(students, actual);
    }

    @Test
   void studentToString() {
        //given
        Students student = new Students(5, "peter");
        ArrayList<Students> students = new ArrayList<>();
        students.add(student);
        StudentDB studentdb = new StudentDB(students);
        //when
        String actual = studentdb.toString();
        //then
        String result = "StudentDB{allStudents=[Studenten{id=5, name='peter'}]}";
        assertEquals(result, actual);

    }

    @Test
    void WrongIdThrowsException(){
        //given
        int id = 1;
        Students student = new Students(5, "peter");
        ArrayList<Students> students = new ArrayList<>();
        students.add(student);
        StudentDB studentdb = new StudentDB(students);
        String expectedMessage = "Kein Student gefunden";
        //when
        try{
          studentdb.findById(id);
          //then
          fail();
        }
        catch (IdNotFoundException e){
            assertEquals(expectedMessage, e.getMessage());
        }
    }

    @Test
    void findByIdThrowsNoException() {
        //given
        int id = 5;
        Students student = new Students(5, "peter");
        ArrayList<Students> students = new ArrayList<>();
        students.add(student);
        StudentDB studentdb = new StudentDB(students);

        //when
        Students actual = studentdb.findById(id);

        //then
        assertEquals(student,actual);
    }
}