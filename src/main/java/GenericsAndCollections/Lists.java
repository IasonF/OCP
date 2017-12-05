package GenericsAndCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lists {

    public void makeLists() {
        List<Integer> partList = new ArrayList<>();
        partList.add(1111);
        partList.add(2222);
        partList.add(3333);
        System.out.println(partList.get(0));
        partList.set(0,1);
        ListIterator<Integer> iterator = partList.listIterator(0);
        System.out.println(iterator.next());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Integer five = 5;
        System.out.println(five);
    }
}
