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
}
