package GenericsAndCollections;

import java.util.List;

public class GenericPrint <T> {

    public GenericPrint(List<T> list) {
        for (Object element :list
             ) {
            System.out.println(element);
        }

    }
}
