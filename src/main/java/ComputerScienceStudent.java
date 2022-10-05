public class ComputerScienceStudent extends Student{
    private String programmingLanguages;

    public ComputerScienceStudent(int id, String name, String programmingLanguages) {
        super(id, name);
        this.programmingLanguages = programmingLanguages;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "programmingLanguages='" + programmingLanguages + '\'' +
                "} " + super.toString();
    }
}
