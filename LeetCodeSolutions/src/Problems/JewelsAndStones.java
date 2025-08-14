package Problems;

public class JewelsAndStones {
    // public int numJewelsInStones(String jewels, String stones) {
    //     String[] strArr = stones.split("");
    //     int count = 0;

    //     for(int i=0;  i<strArr.length;  i++) {
    //         if(jewels.contains(strArr[i])) {
    //             count++;
    //         }
    //     }

    //     return count;        
    // }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i < jewels.length();  i++) {
            char jewel = jewels.charAt(i);
            for(int j=0;  j < stones.length();  j++) {
                if(jewel == stones.charAt(j)) {
                    count++;
                }
            }

        }  
        return count;   
    }
}
