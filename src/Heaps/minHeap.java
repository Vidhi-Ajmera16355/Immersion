package Heaps;
import java.util.*;
public class minHeap {

	private ArrayList<Integer> list;
	
	public minHeap() {
		this.list = new ArrayList<>();
		
	}
	
	public void add(int data) {
		this.list.add(data);
		upHeapify(this.list.size()-1); //last idx
	}
	
	private void upHeapify(int child_idx) {
		if(child_idx==0) return ;
		int parent = (child_idx-1)/2;
		if(this.list.get(parent) > this.list.get(child_idx)) {
			swap(parent,child_idx);
			upHeapify(parent);
		}
	}
	
	public int remove() {
		if(this.list.size()==0) {
			System.out.println("LIST IS EMPTY");
			return -1;
		}
		swap(0,this.list.size()-1);
		int element = this.list.remove(this.list.size()-1);
		downHeapify(0);
		return element;
	}
	
	private void downHeapify(int parent) {
		
		if(parent==list.size()-1) return;
		
		int leftChild = parent*2+1;
		int rightChild = parent*2+2;
		
		int temp = parent;
		if(leftChild<this.list.size() && this.list.get(temp)>this.list.get(leftChild)) {
			temp = leftChild;
		}
		if(rightChild<this.list.size() && this.list.get(temp)>this.list.get(rightChild)) {
			temp = rightChild;
		}
		if(temp!=parent) {
			swap(temp,parent);
			downHeapify(temp);
		}
	}
	
	public int get() {
		return this.list.size()>0 ? this.list.get(0) : -1;
	}
	
	public boolean isEmpty() {
		return this.list.size()==0;
	}
	
	private void swap(int i, int j) {
		int temp = this.list.get(i);
		this.list.set(i, this.list.get(j));
		this.list.set(j, temp);
	}

}
