package GenericsAndCollections;

public class ComparableStudent implements Comparable<ComparableStudent> {
    private String name;
    private long id = 0;
    private double gpa = 0.0;

    public ComparableStudent(String name, long id, double gpa) {
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
    public int compareTo(ComparableStudent s) {
        int result = this.name.compareTo(s.getName());
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "ComparableStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }
}
