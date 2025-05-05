package Problems;

public class CountTripletsThatCanFormTwoArraysOfEqualXOR {
    public int countTriplets(int[] arr) {
        int xorOfArr[] = new int[arr.length + 1];

        for(int i= 0; i<arr.length;  i++) {
            xorOfArr[i+1] = xorOfArr[i] ^ arr[i];
        }
        int count = 0;

        for(int i=0;  i<arr.length;  i++) {
            for(int j=i+1;  j<arr.length;  j++) {                
                for(int k=j;  k<arr.length;  k++) {
                    int a = xorOfArr[i] ^ xorOfArr[j];
                    int b = xorOfArr[k+1] ^ xorOfArr[j];
                    if(a == b) {
                        count++;
                    }
                }
            }
        }
        return count;        
    }
}
