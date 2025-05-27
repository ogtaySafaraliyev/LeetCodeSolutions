package Problems;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];

        for(int i=0;  i<image.length;  i++) {
            int[] firstStage = reverseArray(image[i]);
            
            for(int j=0;  j<image[i].length;  j++) {
                ans[i][j] = firstStage[j] ^ 1;
            }

        }
        return ans;
        
    }

    private int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}
