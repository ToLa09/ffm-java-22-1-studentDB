package students;

public class BiologyStudent extends Student{
    public BiologyStudent(int id, String name, String address, int identityCardNumber) {
        super(id, name, address, identityCardNumber);
    }

    @Override
    public void writeTest() {
        System.out.println("Ich lege Prüfungen in Biologie ab.");
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}
