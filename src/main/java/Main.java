import students.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        Der Konstruktor nimmt ein Array von Studenten entgegen
        Jeder students.Student hat einen Namen und eine Id
        Die Methode getAllStudents gibt alle Studenten als Array zurück
        Die Methode toString() gibt alle Studenten formatiert als String zurück
        Die Methode randomStudent() gibt einen zufälligen Studenten zurück (Nutze für den Zufall Math.random())

        Erweitere die students.StudentDB um eine findById(int id) Methode.
        Die findById Methode soll eine passende Exception werfen, wenn kein students.Student mit der Id existiert.
        Optional (Bonus):
        Schreibe einen Test mittels try/catch der dieses Verhalten überprüft.
        */

        ComputerScienceStudent student1 = new ComputerScienceStudent(1 , "peter", "Leipzig",12345, "java");
        ComputerScienceStudent student2 = new ComputerScienceStudent(212 , "Hans", "Hamburg", 84812, "javascript, html");
        BiologyStudent student3 = new BiologyStudent(93 , "Klaus", "Berlin", 92132);
        ComputerScienceStudent student4 = new ComputerScienceStudent(40 , "Karl", "Köln", 12381, "javascript, java, html, css");
        BiologyStudent student5 = new BiologyStudent(84, "Lukas", "München", 19231);
        HashMap<Integer, Student> students = new HashMap<>(Map.of(
                student1.getId(), student1,
                student2.getId(), student2,
                student3.getId(), student3,
                student5.getId(), student5
        ));

        ComputerScienceStudent tobias = new ComputerScienceStudent(59, "tobias", "Leipzig", 98599, "java, html, css");
        System.out.println(tobias);

        StudentDB studentdb = new StudentDB(students);

        System.out.println("Zufälliger students.Student: " + studentdb.randomStudent());

//        System.out.println(studentdb);
        studentdb.addStudent(student4);
//        System.out.println(studentdb);
//        studentdb.removeStudent(1);
//        System.out.println(studentdb);

        try{
            System.out.println(studentdb.findById(40).toString());
        }
        catch (IdNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
