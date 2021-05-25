package com.revature.game;

import com.revature.fixtures.Room;

/*
 * Represents the player moving through these rooms. 
 * The player has these properties:
 * 		- Room currentRoom: the room the player is currently in. 
 * 
 * */

public class Player {

	Room currentRoom;
	
	public Player(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	
	
}
