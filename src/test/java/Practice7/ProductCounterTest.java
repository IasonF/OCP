package Practice7;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class ProductCounterTest {
    private Map<String, String> productNames = new TreeMap<>();
    public String[] parts;

    @Before
    public void init() {
        parts = new String[] {"Blue Polo Shirt","Black Polo Shirt", "Red Ball Cap",
                "Duke Mug","Black Polo Shirt", "Red Ball Cap", "Duke Mug"};
        productNames.put("1S01", "Blue Polo Shirt");
        productNames.put("1S02", "Black Polo Shirt");
        productNames.put("1H01", "Red Ball Cap");
        productNames.put("1M02", "Duke Mug");
//        for (String s: productNames.keySet()
//             ) {
//            System.out.println(productNames.get(s));
//        }

    }

    @Test
    public void processList() throws Exception {
        ProductCounter productCounter = new ProductCounter(productNames);
        productCounter.processList(parts);
        productCounter.printReport();
    }

}