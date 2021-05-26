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
	
	public static Scanner scanner = new Scanner(System.in);
	public static RoomManager rm = new RoomManager(10);
	public static boolean playing = true;
	public static String[] command;
	public static Room currentRoom;
	public static Player player = new Player();
//	public static String input;
	public static String direction;
	public static String action;
//	public static String target;
	
	
	public static void main(String[] args) {
		
		rm.init();
		player.setCurrentRoom(rm.getStartingRoom());
		
		
		System.out.println("Welcome to my house tour!" + 
				"\nYou enter into my house through the front door directly into the entryway.");
		
		printRoom(player);
		
		while (playing) {
			
			collectInput();
			parse(command, player);
			
			if (action != null) {
				
				switch (action) {
				
					case "quit" : {
						
						System.out.println("Goodbye!");
						playing = false;
						break;
						
					}
					
					case "go" : {
						
						switch (direction) {
							
							case "west" : {
								player.setCurrentRoom(player.getCurrentRoom().getExit(currentRoom, "west"));
								printRoom(player);
								break;
							}
							
							case "north" : {
								player.setCurrentRoom(player.getCurrentRoom().getExit(currentRoom, "north"));
								printRoom(player);
								break;
							}
							
							case "east" : {
								player.setCurrentRoom(player.getCurrentRoom().getExit(currentRoom, "east"));
								printRoom(player);
								break;
							}
							
							case "south" : {
								player.setCurrentRoom(player.getCurrentRoom().getExit(currentRoom, "south"));
								printRoom(player);
								break;
							}
							
							default: {
								
								break;
							}
						}
						
						break;
					}
					
					default: {
						System.out.println("Please enter a direction or 'quit'!");
						break;
					}
				}
			}
			
			else {
				continue;
			}
		}
	

	}
	
	private static void printRoom(Player player) {
		System.out.println("\nYou've entered the " + player.getCurrentRoom().getName());
		System.out.println(player.getCurrentRoom().getLongDescription());
		
	}
	
	
	
	private static String[] collectInput() {
	
		command = scanner.nextLine().split(" ");
		return command;
		
	}
	
	
	
	
	private static void parse(String[] command, Player player) {
		
		for (int i = 0; i < command.length; i++) {
			
			if (command[i].equalsIgnoreCase("quit")) {
				action = "quit";

			} else if (command[i].equalsIgnoreCase("west")) {
				
				if (player.getCurrentRoom().getExit(currentRoom, "west") != null ) {
					
					action = "go";
					direction = "west";
					break;
					
				} else {
					
					action = "incorrect";
					System.out.println("You've hit a dead end. Please enter another direction!");
					
				}
				
			} else if (command[i].equalsIgnoreCase("north")) {
				
				if (player.getCurrentRoom().getExit(currentRoom, "north") != null) {
					
					action = "go";
					direction = "north";
					break;
				} else {
					
					action = "incorrect";
					System.out.println("You've hit a dead end. Please enter another direction!");
					
				}
				
			} else if (command[i].equalsIgnoreCase("east")) {
				
				if (player.getCurrentRoom().getExit(currentRoom, "east") != null) {
					
					action = "go";
					direction = "east";
					break;
					
				} else {
					
					action = "incorrect";
					System.out.println("You've hit a dead end. Please enter another direction!");
					
				}
				
			} else if (command[i].equalsIgnoreCase("south")) {
				
				if (player.getCurrentRoom().getExit(currentRoom, "south") != null) {
					
					action = "go";
					direction = "south";
					break;
					
				} else {
					
					action = "incorrect";
					System.out.println("You've hit a dead end. Please enter another direction!");
						
				}
				
			} else {
				
				action = "incorrect";
//				System.out.println("Please try again!");
				
			}
		}
	}
}
