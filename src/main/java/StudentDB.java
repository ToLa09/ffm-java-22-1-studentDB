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
        return "StudentDB{" +
                "allStudents=" + allStudents +
                '}';
    }
    public Student randomStudent(){
        int index = (int)(Math.random() * allStudents.size());
        return allStudents.get(index);
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
