package Problems;

public class ReverseDegreeOfAString {
    public int reverseDegree(String s) {
        int sum = 0;

        for(int i=0; i<s.length();  i++) {
            sum += (123 - s.charAt(i)) * (i+1);

        }
        return sum;        
    }
}
