package com.darin.iterator;



public class LinkedList implements Collection{
	Node head = null;
	Node tail = null;
	private int size;
	@Override
	public void add(Object o) {
		Node n = new Node(o,null);
		if(head == null) {
			head = n;
			tail = n;  
		}
		tail.setData(n);
		tail = n;
		size++;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator{
		Node current = head;
		@Override
		public Object next() {
			Node temp = current;
			current = temp.getNext();
			return temp;
		}

		@Override
		public boolean hasNext() {
			if(current==null) {
				return false;
			}
			return true;
		}
		
	}

}
