package GenericsAndCollections;

import java.util.Comparator;

public class StudentSortName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName());
        return result;
    }
}
