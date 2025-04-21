package Problems;

public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int count = 0;
        int min = 0;

        if(a>b) {
            min = b;
        }
        else {
            min = a;
        }

        for(int i=1;  i<=min;  i++) {
            if(a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
        
    }
}
