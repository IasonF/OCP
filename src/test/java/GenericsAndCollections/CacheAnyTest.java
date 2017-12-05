package GenericsAndCollections;

import org.junit.Test;

public class CacheAnyTest {
    private final String s1 ="Hello";
    private final Integer i = 5;

    @Test
    public void setT() throws Exception {
        CacheAny<String> myGenericMessage = new CacheAny<>();
        CacheAny<Integer> myGenericInteger = new CacheAny<>();
        myGenericMessage.setT(s1);
        myGenericInteger.setT(i);
        assert myGenericMessage.getT().equals(s1);
        assert myGenericInteger.getT() == i;
    }

    @Test
    public void getT() throws Exception {
    }

}