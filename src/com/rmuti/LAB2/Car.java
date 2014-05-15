package com.rmuti.LAB2;

import java.util.Arrays;

public class Car implements Comparable<Object> {

	private String name;
	private String type;
	private int price;

public Car(String name,String type,int price){
	this.name = name;
	this.type = type;
	this.price = price;
}

public int compareTo(Object e) {
	 Car c = (Car) e;
	 if(this.price>c.price){
		 return 1;
	 }else if(this.price==c.price){
		return 0; 
	 }else {
		 return -1;
	 }

}
@Override
public String toString() {
	return String.format("[name = %s , type = %s, price = %d]",name,
			type, price);
}
public static void main(String[] args) {
	Car[] CarArrays = new Car[] {
			new Car("TOYOTA","vios",669000),
			new Car("TOYOTA","vigo",600000),
			new Car("ISUZU","D-Max",712000)};
			Arrays.sort(CarArrays);
			System.out.println(Arrays.toString(CarArrays));

}
}