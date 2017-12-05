package AnonymousInnerClasses;

import java.util.List;

public class Z04Analyzer {
    public static void searchArr(List<String> strList, String searchStr, StringAnalyzer analyzer) {
        for (String s : strList)
            if (analyzer.analyze(s, searchStr))
                System.out.println("Match: " + s);
    }
}
