package AnonymousInnerClasses;

import java.util.List;

public class Z03Analyzer {
    public static void searchArr(List<String> strList, String searchStr,
                                 StringAnalyzer analyzer) {
            for (String currentStr:strList){
                if (analyzer.analyze(currentStr,searchStr))
                    System.out.println("Match: " + currentStr);
            }
    }
}
