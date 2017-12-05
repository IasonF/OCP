package GenericsAndCollections;

import org.junit.Test;

import java.util.*;

public class ComparableStudentTest {
    @Test
    public void compareTo() throws Exception {
        Set<ComparableStudent> studentSet = new TreeSet<>();
        studentSet.add(new ComparableStudent("Tomas", 1111, 3.8));
        studentSet.add(new ComparableStudent("John", 2222, 3.9));
        studentSet.add(new ComparableStudent("George", 3333, 3.4));

        for (ComparableStudent s : studentSet
                ) {
            System.out.println(s);
        }
    }

    @Test
    public void comparator() {
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpu = new StudentSortGpa();

        studentList.add(new Student("Tomas", 1111, 3.8));
        studentList.add(new Student("John", 2222, 3.9));
        studentList.add(new Student("George", 3333, 3.4));

        Collections.sort(studentList, sortName);
        new GenericPrint(studentList);
        Collections.sort(studentList, sortGpu);
        new GenericPrint(studentList);
    }
}

