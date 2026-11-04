package problems3;
import java.util.*;

public class FindMedianFromDataStream {
	class MedianFinder {

	    PriorityQueue<Integer> minHeap;
	    PriorityQueue<Integer> maxHeap;    

	    public MedianFinder() {        
	        minHeap = new PriorityQueue<>();
	        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	    }
	    
	    public void addNum(int num) {
	        maxHeap.offer(num);
	            
	        minHeap.offer(maxHeap.poll());
	      
	        if (minHeap.size() - maxHeap.size() > 1) {
	            maxHeap.offer(minHeap.poll());
	        }
	    }
	    
	    public double findMedian() {
	         return minHeap.size() == maxHeap.size() 
	            ? (minHeap.peek() + maxHeap.peek()) / 2.0 
	            : minHeap.peek();    
	    }
	}

	/**
	 * Your MedianFinder object will be instantiated and called as such:
	 * MedianFinder obj = new MedianFinder();
	 * obj.addNum(num);
	 * double param_2 = obj.findMedian();
	 */
}
