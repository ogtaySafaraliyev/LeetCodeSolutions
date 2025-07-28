package Problems;
import java.util.*;

public class FindTheSequenceOfStringsAppearedOnTheScreen {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        char[] charArr = target.toCharArray();
        StringBuilder strBldr = new StringBuilder();
        
        for(char ch: charArr) {
            String base = list.isEmpty() ? "" : list.get(list.size() - 1);

            strBldr.setLength(0);
            strBldr.append(base).append('a');
            list.add(strBldr.toString());            

            for(char j = 'b';  j <= ch; j++) {
                strBldr.setLength(0);
                strBldr.append(base).append(j);
                list.add(strBldr.toString());
            }
            
        }
        return list;
        
    }
}
