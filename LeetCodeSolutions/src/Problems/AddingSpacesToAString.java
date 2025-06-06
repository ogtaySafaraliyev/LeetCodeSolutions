package Problems;

public class AddingSpacesToAString { 
    public String addSpaces(String s, int[] spaces) {
        StringBuilder strBldr = new StringBuilder();
        int j = 0;
        for(int i=0; i<spaces.length; i++) {
            
            int point = spaces[i];            

            String subStr = s.substring(j, point);
            strBldr.append(subStr);

            strBldr.append(" ");
            j = point;

            
            
        }
        strBldr.append(s.substring(j));
        return strBldr.toString();
    }
}
