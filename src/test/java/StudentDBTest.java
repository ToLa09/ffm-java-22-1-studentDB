import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
@Test
    public void getAllStudents(){
    //given
    Students student = new Students(5,"peter");
    Students [] students = {student};
    StudentDB studentdb = new StudentDB(students);
    //when
    Students[] actual =studentdb.getAllStudents();
    //then
    assertArrayEquals(students,actual);
}
@Test
    public void studentToString(){
    //given
    Students student = new Students(5,"peter");
    Students [] students = {student};
    StudentDB studentdb = new StudentDB(students);
    //when
    String actual = studentdb.toString();
    //then
    String result ="StudentDB{allStudents=[Studenten{id=5, name='peter'}]}";
    assertEquals(result,actual);

}
}