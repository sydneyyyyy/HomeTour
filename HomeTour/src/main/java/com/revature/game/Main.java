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
	
	public static RoomManager rm = new RoomManager();
	
	public static String action;
	public static String target;
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Player player = new Player(rm.startingRoom);
		printRoom(player);
		
		String input = scanner.next();
		String[] command = input.split(" ");
		
		parse(command, player);
		
		
		scanner.close();

	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom);
		
	}
	
	
	
	
	private static void parse(String[] inputArr, Player player) {
		System.out.println(inputArr[0]);
	}

}
