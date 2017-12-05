package AnonymousInnerClasses;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ContainsAnalyzerTest {


    @Test
    public void analyze() throws Exception {
        String searchStr = "to";
//       String[] strList = {"tomorrow","toto","to","timbukto","the","hello","heat"};
        List<String> strList = Arrays.asList("tomorrow", "toto", "to", "timbukto", "the", "hello", "heat");
        System.out.println("Searching for: " + searchStr);

        AnalyzerTool analyzerTool = new AnalyzerTool();
        ContainsAnalyzer contains = new ContainsAnalyzer();
        System.out.println("===Contains===");
        System.out.println("    Regular class example:");
        for (String target : strList) {
            if (analyzerTool.arrContains(target, searchStr))
                System.out.println(target);
        }

        System.out.println("    Interface example:");
        for (String target : strList) {
            if (contains.analyze(target, searchStr))
                System.out.println(target);
        }

        System.out.println("    With helper method:");
        Z03Analyzer.searchArr(strList, searchStr, contains);

        System.out.println("    With anonymous inner class");
        Z04Analyzer.searchArr(strList, searchStr,
                new StringAnalyzer() {
                    @Override
                    public boolean analyze(String target, String searchStr) {
                        return target.contains(searchStr);
                    }
                });

        System.out.println("    With lambda expression");
        Z04Analyzer.searchArr(strList, searchStr,
                (t, s) -> t.contains(s));

        System.out.println("    Strings that end with: " + searchStr );
        Z04Analyzer.searchArr(strList,searchStr,(t,s) -> t.endsWith(s));

        System.out.println("    String that contains \"" + searchStr + "\" and are 5 characters or less.");
        Z04Analyzer.searchArr(strList,searchStr, (t,s) -> t.contains(s) && t.length()<5 );

        System.out.println("    String that contains \"" + searchStr + "\" and are 5 characters or more.");
        Z04Analyzer.searchArr(strList,searchStr, (t,s) -> t.contains(s) && t.length()>5 );



    }

}