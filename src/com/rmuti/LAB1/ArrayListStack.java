package com.rmuti.LAB1;

public class ArrayListStack {
	ArrayList list = new ArrayList();
	public void push(Object e) {
		list.add(e);
	}
	public Object pop() {
		Object a = list.get(list.size());
		list.remove(list.size());
		return a;
	}
	public Object peek() {
		return list.get(list.size());
	}
	@Override
	public String toString() {		
		return String.valueOf(list);
	}
	public static void main(String[] args) {
		
		ArrayListStack stack = new ArrayListStack();
		stack.push("aaa");
		stack.push("bbb");
		stack.push("ccc");
		stack.push("ddd");
		stack.push("eee");
		System.out.println(stack);
	}

}
