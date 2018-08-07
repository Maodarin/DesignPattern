package com.darin.iterator;

public class ArrayList implements Collection {
	Object[] objects = new Object[10];
	int index = 0;
	@Override
	public void add(Object o) {
		if(index == objects.length) {
			Object[] newObjects = new Object[2*objects.length];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index]=o;
		index++;
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator {
		private int currentIndex=0;
		@Override
		public Object next() {
			Object o = objects[currentIndex];
			currentIndex++;
			return o;
		}

		@Override
		public boolean hasNext() {
			if(currentIndex>=index)
				return false;
			return true;
		}
		
	}

}
