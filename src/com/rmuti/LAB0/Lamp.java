package com.rmuti.LAB0;

public class Lamp {
	private String name;
	private String position;
	private String friend[];
	public Lamp() {
		name = "Lamp";
		position = "RB";
		friend = new String[]{"Tores","Esian","Chec"};
	}
	public Lamp(int a) {
		System.out.println("Lamp Overloading 1");
	}
	public String getName(){			
		return name;		
	}
	public String getPosition(){			
		return position;		
	}
	public String[] getFriend(){			
		return friend;		
	}
}
