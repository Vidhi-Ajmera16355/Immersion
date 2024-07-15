package Heaps;
import java.util.*;
public class priorityQueue {

	public static void main(String[] args) {
		
		int[] arr = {10,2,40,1,2,59};
		PriorityQueue <Integer> minHeap = new PriorityQueue<>();
		for(int data:arr) {
			minHeap.add(data);
		}
		
		
//		minHeap.addAll(minHeap);
//		wrapper class not primitive data types!!
		
		
		while(!minHeap.isEmpty()) {
			System.out.print(minHeap.remove()+" ");
		}
	}

}
