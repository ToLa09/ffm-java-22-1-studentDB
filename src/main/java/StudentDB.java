import java.util.Arrays;

public class StudentDB {

    private Students[] allStudents;

    public StudentDB(Students[] students) {
    allStudents = students;
    }

    public Students[] getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(Students[] allStudents) {
        this.allStudents = allStudents;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudents=" + Arrays.toString(allStudents) +
                '}';
    }
    public Students randomStudent(){
        String student = "hallo";
        int index = (int)(Math.random() * allStudents.length);
        return allStudents[index];
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
