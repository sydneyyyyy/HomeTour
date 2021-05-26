package com.revature.game;

import java.util.Scanner;

import com.revature.fixtures.Room;

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
	
	public static RoomManager rm = new RoomManager(10);
	public static boolean playing = true;
	public static String[] command;
	public static Room currentRoom;
	public static Player player = new Player();
//	public static String action;
//	public static String target;
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		rm.init();
		player.setCurrentRoom(rm.getStartingRoom());
		
		
		
		System.out.println("Welcome to my house tour!" + 
				"\nYou enter into my house through the front door directly into the entryway.");
		
		
		
		while (playing) {
			printRoom(player);
			String[] input = collectInput(scanner);
			
			parse(input, player);
		}
		if (!playing) {
			System.out.println("Goodbye!");
		}
		
		scanner.close();

	}
	
	private static void printRoom(Player player) {
		System.out.println("\nYou are currently in: " + player.currentRoom.getName());
		System.out.println("LongDescription: " + player.currentRoom.getLongDescription());
		
	}
	
	
	
	private static String[] collectInput(Scanner scanner) {
		System.out.println("\nWhat direction would you like to go?");
		command = scanner.nextLine().split(" ");
		

		return command;
		
	}
	
	
	
	
	private static void parse(String[] command, Player player) {
		String action = command[0];
		System.out.println(action);
		String direction = command[1];
		System.out.println(direction);
//		String direction = null;
		
//		if (command.length > 1) {
//			direction = command[1].toLowerCase();
//			System.out.println(direction);
//		}
		
		for (int i = 0; i < command.length; i++) {
			if (command[i].equalsIgnoreCase("west")) {
				
				if (player.getCurrentRoom().getExit(currentRoom, "west") != null ) {
					action = "go";
					direction = "west";
					break;
				} 
			}
			
		}
//		if (action == "go") {
//			Room move = player.getCurrentRoom().getExit(direction, action);
//			player.setCurrentRoom(move);
//			System.out.println(move);
//		} else if (action == "quit") {
//			playing = false;
//		
//		}
		
		
	}

}
