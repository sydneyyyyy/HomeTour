package com.revature.fixtures;

/*
 * This represents a room in the house. It will inherit the descriptive properties.
 * and will also have the following properties:
 * 		- Room[] exits: the rooms adjacent to this one. You might decide that a room in a 
 * 						particular direction always uses a certain index, e.g. a north exit
 * 						always goes in index 0, an east exit always goes in index 1, etc. 
 * 						If so, then the size of this array depends on how many directions you
 * 						you want to support. 
 * 
 * 		- Constructor that accepts a name, shortDescription, and longDescription.
 * 		- create a getter not just for all the exits, but for a particular exit given a direction.
 * 
 * */

public class Room extends Fixture {

	private Room[] exits = new Room[10];

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	
	}
	
	
	public Room[] getExits() {
		return exits;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
//	public void setExits(Room exit, int i) {
//		this.exits[i] = exit;
//	}

	public Room getExit(Room room, String direction) {
		switch (direction) {
			case  "west" : {
				room = exits[0];
				break;
			}
			
		}
		return room;
	}
}
