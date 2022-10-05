package students;

public abstract class Student implements Citizen {
    private int id ;
    private String name;
    private String address;
    private int identityCardNumber;

    public Student(int id, String name, String address, int identityCardNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.identityCardNumber = identityCardNumber;
    }

    public abstract void writeTest();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public String toString() {
        return "students.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
