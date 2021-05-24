package com.revature.game;

import com.revature.fixtures.Room;

/*
 * Will be responsible for "loading" our rooms into memory.
 * When game.Main is executed, it will invoke the init() method in this
 * class that will instantiate all our Room objects, link them together as exits, 
 * and designate a startingRoom.
 * 
 * 		- Room startingRoom: the room a player should start in
 * 		- Room[] rooms: all the rooms in the house.
 * 
 * 
 * */


public class RoomManager {
	
	
	Room startingRoom;
	Room[] rooms;


	public void init() {
		
		
		
		Room entryway = new Room(
				"The Entryway", 
				"The small Entryway",
				"The small entryway of a midwestern, two-story house. A living room is open to the west, where a sitting area can be seen." + "\n"
				+ "A staircase is seen leading up to the second floor." 
				+ "The hardwood floor leads north to the kitchen with white cabinets.");
		this.rooms[0] = entryway;
		this.startingRoom = entryway;
						
				
	}
	
}
