package Problems;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr: matrix) {
            if(binarySearch(arr, target)) {
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        while(left <= right) {

            if(target > arr[mid]) {
                left = mid + 1;
            }

            else if(target < arr[mid]) {
                right = mid - 1;
            }

            else if(target == arr[mid]) {
                return true;
            }
            mid = (left + right) / 2;
        }

        return false;
    }
}
