package com.revature.game;

import java.util.Scanner;

/*
 * This class stores the main() method. Where the game loop will go, where we'll
 * display the prompt, collect input, and parse that input. 
 * 
 * The printRoom(Player) method will print a prompt to the console for the player's 
 * current room. 
 * 
 * The collectInput() method will use a Scanner object to collect console input from the 
 * user, and then will divide that input into multiple parts: 
 * 		1. An action
 * 		2. The target of an action (if any)
 * 
 * "go east" -> "go" is the command, "east" is the target. 
 * This method will break the input into a String[], and return that. 
 * 
 * The parse(String[], Player) method will take the output of the above collectInput()
 * method and a player object, and will resolve that command. 
 * 		- use a switch statement
 * 
 * */

public class Main {
	
	public static String action;
	public static String target;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type Start to start the house tour!");

		String input = scanner.nextLine();
		String[] arrInput = input.split(" ", 1);
		
		
		arrInput[0] = action;
		arrInput[1] = target;
		
		scanner.close();
	}
	
	private static void printRoom(Player player) {
		System.out.println("Prompt user for current room.");
	}
	
	private static String[] collectInput() {
		return null;
		
	}
	
	private static void parse(String[] command, Player player) {
		
	}

}
