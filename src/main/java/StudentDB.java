import java.util.ArrayList;

public class StudentDB {

    private ArrayList<Students> allStudents;

    public StudentDB(ArrayList<Students> students) {
        allStudents = students;
    }

    public ArrayList<Students> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(ArrayList<Students> allStudents) {
        this.allStudents = allStudents;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudents=" + allStudents +
                '}';
    }
    public Students randomStudent(){
        int index = (int)(Math.random() * allStudents.size());
        return allStudents.get(index);
    }
    public Students findById(int id){
        for (Students student : allStudents){
            if (student.getId() == id){
                return student;
            }
        }
        throw new IdNotFoundException("Kein Student gefunden");
    }

    public void addStudent(Students student) {
        int id = student.getId();
        for (Students s : allStudents) {
            if (s.getId() == id) {
                throw new RuntimeException("ID bereits vorhanden");
            }
        }
        allStudents.add(student);
    }

    public void removeStudent(int id) {
        for (Students student : allStudents) {
            if (student.getId() == id) {
                allStudents.remove(student);
                return;
            }
        }
    }
}
