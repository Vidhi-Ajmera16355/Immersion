package Heaps;

import java.util.*;

public class maxHeap {

	public static void main(String[] args) {
		int[] arr = {10,2,40,1,2,59};
		PriorityQueue <Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		
//		////Using comparator
		
		
//		PriorityQueue <Integer> minHeap = new PriorityQueue<>(
//				
//			);		
		
		
		for(int data:arr) {
			maxHeap.add(data);
		}
		
//		minHeap.addAll(minHeap);
//		wrapper class not primitive data types!!
		
		
		while(!maxHeap.isEmpty()) {
			System.out.print(maxHeap.remove()+" ");
		}
	}

}
