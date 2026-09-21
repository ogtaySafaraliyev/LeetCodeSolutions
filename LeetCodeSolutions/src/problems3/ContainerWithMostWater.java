package problems3;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while(leftPointer < rightPointer) {
            
            int minHeight = Math.min(height[rightPointer], height[leftPointer]);
            int diff = rightPointer - leftPointer;

            int currArea = minHeight * diff;

            maxArea = Math.max(currArea, maxArea);

            if(height[rightPointer] > height[leftPointer]) leftPointer++;
            else rightPointer--;            
        }
        return maxArea;
    }
}
