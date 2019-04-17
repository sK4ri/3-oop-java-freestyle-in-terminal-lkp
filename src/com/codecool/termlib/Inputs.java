package com.codecool.termlib;

mport java.util.Scanner;  // Import the Scanner class

class Inputs {
	public static void main(String[] args) {
	inputs(); 
  }
	public static int inputs(){
	Scanner direction = new Scanner(System.in);
	System.out.println("give me a direction");

	String dir = direction.next();
	int button = 0;
	switch (dir) {
	case "w":
		System.out.println("fel");
		button = 1;
		break;
	case "s":
		System.out.println("le");
		button = 2;
		break;
	case "a":
		System.out.println("jobb");
		button = 3;
		break;
	case "d":
		System.out.println("bal");
		button = 4;
		break;
}

System.out.println(button);
return button;} 	
} 
