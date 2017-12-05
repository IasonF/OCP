package Practice7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
    private Map<String, Long> productCountMap = new HashMap<>();
    private Map<String, String> productNames = new TreeMap<>();

    public ProductCounter(Map<String, String> productNames) {
        this.productNames = productNames;
    }

    public void processList(String[] list){
        long curVal = 0;
        for (String itemNumber: list
             ) {
            if (productCountMap.containsKey(itemNumber)){
                curVal = productCountMap.get(itemNumber);
                curVal++;
                productCountMap.put(itemNumber,new Long(curVal));
            }
            else {
                productCountMap.put(itemNumber, new Long(1));
            }
        }
    }
    
    public void printReport() {
        System.out.println("===Product Report===");
        for (String key: productNames.keySet()
             ) {
            System.out.print("Name: " + key);
            System.out.println("\t\t Count: " + productCountMap.get(productNames.get(key)));
        }
    }
}
