package Problems;

public class MinimumAmountOfTimeToCollectGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        int count = 0;
        int lastM = 0, lastG = 0, lastP = 0;

        for(int i=0; i<garbage.length; i++) {

            count += garbage[i].length();

            if(garbage[i].contains("P")) lastP = i;
            if(garbage[i].contains("G")) lastG = i;
            if(garbage[i].contains("M")) lastM = i;            
        }    

        int[] pref = new int[garbage.length];
        for(int i=1; i<garbage.length; i++) {
            pref[i] = pref[i-1] + travel[i-1];
        }

        count += pref[lastM] + pref[lastG] + pref[lastP];
        return count;
    }
}
