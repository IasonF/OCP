package GenericsAndCollections;

import java.util.Comparator;

public class StudentSortGpa implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpa() < o2.getGpa())
            return 1;
        else if (o1.getGpa() > o2.getGpa())
            return -1;
        else
            return 0;
    }
}
