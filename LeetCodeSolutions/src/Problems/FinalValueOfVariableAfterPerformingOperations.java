package Problems;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation: operations) {
            if(operation.contains("+")) {
                x++;
            }
            else if(operation.contains("-")) {
                x--;
            }
        }
        return x;        
    }
}
