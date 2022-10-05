package students;

public class ComputerScienceStudent extends Student{
    private String programmingLanguages;

    public ComputerScienceStudent(int id, String name, String address, int identityCardNumber, String programmingLanguages) {
        super(id, name, address, identityCardNumber);
        this.programmingLanguages = programmingLanguages;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void writeTest() {
        System.out.println("Ich lege Prüfungen in Computer Science ab.");
    }

    @Override
    public String toString() {
        return "students.ComputerScienceStudent{" +
                "programmingLanguages='" + programmingLanguages + '\'' +
                "} " + super.toString();
    }
}
