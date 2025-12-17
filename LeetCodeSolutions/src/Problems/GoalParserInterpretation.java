package Problems;

public class GoalParserInterpretation {
	class Solution {
	    public String interpret(String command) {       
	        StringBuilder strBldr = new StringBuilder();
	        int i = 0;

	        while(i < command.length()) {
	            if(command.indexOf("G", i) == i) {
	                strBldr.append("G");
	                i += 1;
	            }
	            else if(command.indexOf("()", i) == i) {
	                strBldr.append("o");
	                i += 2;
	            }
	            else if(command.indexOf("(al)", i) == i) {
	                strBldr.append("al");
	                i += 4;
	            }

	        }
	        return strBldr.toString();
	        
	    }
	}
}
