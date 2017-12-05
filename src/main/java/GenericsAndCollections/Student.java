package GenericsAndCollections;

public class Student {
    private String name;
    private long id;
    private double gpa;

    public Student(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {

        return name;
    }

    public long getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
