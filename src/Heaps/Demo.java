package Heaps;

public class Demo {

	public static void main(String[] args) {
		minHeap heap = new minHeap();
		heap.add(10);
		heap.add(12);
		heap.add(15);
		heap.add(3);
		heap.add(6);
		heap.add(1);
//		System.out.println(heap.get());
//		System.out.println(heap.remove());
//		
		while(!heap.isEmpty()) {
			System.out.print(heap.remove()+" ");
		}
		
	}
}
