package Problems;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int max = 0;

        for(int i = 0;  i < n.length();  i++) {
            int currentDigt = n.charAt(i) - '0';
            max = Math.max(max, currentDigt);

            // if(max == 9) {
            //     break;
            // }
        }
        return max;    
    }
}
