 package com.rmuti.LAB1;

public class ArrayListQueue {
	private ArrayList list = new ArrayList();

	public void enQueue(Object e) {
		list.add(e);
	}
	public Object deQueue() {
		Object a = list.get(0);
		list.remove(0);
		return a;
	}
	public String peek() {
		return (String) list.get(0);
	}
	@Override
	public String toString() {		
		return String.valueOf(list);
	}
	public static void main(String[] args) {

		ArrayListQueue queue = new ArrayListQueue();
		queue.enQueue("test1");
		queue.enQueue("test2");
		queue.enQueue("test3");
		queue.enQueue("test4");
		queue.enQueue("test5");
		System.out.println(queue);
	}

}
