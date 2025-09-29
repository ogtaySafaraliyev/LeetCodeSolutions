package Problems;
import java.util.*;

public class RestoreFinishingOrder {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();

        for(int friend: friends) {
            set.add(friend);
        }

        List<Integer> list = new ArrayList<>();
        for(int id: order) {
            if(set.contains(id)) {
                list.add(id);
            }
        }

        int[] arr = new int[list.size()];
        int i = 0;
        for(int id: list) {
            arr[i++] = id;
        }
        return arr;
    }
}
