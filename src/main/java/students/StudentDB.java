package students;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentDB {

    private HashMap<Integer, Student> allStudents;

    public StudentDB(HashMap<Integer, Student> students) {
        this.allStudents = students;
    }

    public HashMap<Integer, Student> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(HashMap<Integer, Student> allStudents) {
        this.allStudents = allStudents;
    }

    @Override
    public String toString() {
        return "students.StudentDB{" +
                "allStudents=" + allStudents +
                '}';
    }
    public Student randomStudent(){
        ArrayList<Integer> keyList = new ArrayList<>(allStudents.keySet());

        int index = (int)(Math.random() * keyList.size());
        int key = keyList.get(index);

        return allStudents.get(key);
    }
    public Student findById(int id){
        return allStudents.get(id);
        }


    public void addStudent(Student student) {
        int id = student.getId();
        if(allStudents.containsKey(id)) {
            throw new RuntimeException("ID bereits vorhanden");
        }
        allStudents.put(id, student);
    }


    public void removeStudent(int id) {
        allStudents.remove(id);
    }
}
