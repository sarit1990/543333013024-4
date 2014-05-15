package com.rmuti.LAB1;

public class ArrayList {
	private Object[] elementData = new Object[1];
	private int size = 0;

	public void add(Object e) {
		add(size, e);
	}

	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		for (int j = size - 1; j >= i; j--) {
			elementData[j + 1] = elementData[j];
		}
		elementData[i] = e;
		size++;
	}

	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int s = 2 * elementData.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < size; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}

	public void addFirst(Object e) {
		add(0, e);
	}

	public void addLast(Object e) {
		add(size, e);
	}

	public void remove(int i) {
		for (int j = i; j < size - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
		size--;
	}

	public String toString() {
		String ret = "[";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				ret = ret + elementData[i] + "]";
			} else {
				ret = ret + elementData[i] + ",";
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		ArrayList lst = new ArrayList();
		lst.add("aaa");
		lst.add("bbb");
		lst.add("ccc");
		System.out.println(lst);
	}
}