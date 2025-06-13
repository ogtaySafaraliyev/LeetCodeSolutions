package Problems;

public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if(k == 0) {
            return ans;
        }

        else if(k < 0) {
            for(int i=0;  i<n;  i++) {
                int sum = 0;
                //this (((-k))) part
                for(int j=1;  j<=k * (-1);  j++) {
                    sum += code[(i - j + n) % n];
                }
                ans[i] = sum;
            }            
        }

        else if(k > 0) {
            for(int i=0;  i<n;  i++) {
                int sum = 0;
                for(int j=1;  j<=k;  j++) {
                    sum += code[(i + j + n) % n];
                }
                ans[i] = sum;
            }
        }
        return ans;    
    }
}
