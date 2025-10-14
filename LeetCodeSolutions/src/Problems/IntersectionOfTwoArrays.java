package Problems;
import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count = new int[1001];

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num: nums1) {
            set1.add(num);
        }

        for(int num: nums2) {
            set2.add(num);
        }

        for(int num: set1) {
            list.add(num);
        }

        for(int num: set2) {
            list.add(num);
        }


        List<Integer> myList = new ArrayList<>();

        for(int num: list) {
            count[num]++;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] == 2) {
                myList.add(i);
            }
        }

        int[] ansArr = new int[myList.size()];
        int i=0;

        for(int num: myList) {
            ansArr[i++] = num;
        }
        return ansArr;
        
    }
}
