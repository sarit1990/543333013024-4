package com.rmuti.LAB0;

import java.util.Arrays;

public class Show {

	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		System.out.println("name : "+lamp.getName());
		System.out.println("position : "+lamp.getPosition());
		System.out.println("friend : "+Arrays.toString(lamp.getFriend()));
		new Lamp(1);
	}

}
