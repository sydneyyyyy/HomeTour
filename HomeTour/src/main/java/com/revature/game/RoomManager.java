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
	
	
	
	public RoomManager(int index) {
		this.rooms = new Room[index];
	}

	
	public Room getStartingRoom() {
		return startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	

	public void init() {
		Room entryway = new Room(
				"entryway",
				"The small Entryway",
				"The small entryway of a midwestern, two story house. To the west a formal living room can be seen." + 
				"\nThere is a staircase directly north of the entryway leading up to the second floor where the bedrooms and bathroom are located."
				+ "\nThe hardwood floor leads east into the kitchen with white cabinets and a large refrigerator.");
		rooms[0] = entryway;
		setStartingRoom(entryway); 
		
		Room livingRoom = new Room(
				"Living Room",
				"The cozy living room",
				"You enter the cozy living room with a comfy couch against the wall." + 
				"To the east is a dining room. " +
				"To the south is the entryway.");
		rooms[1] = livingRoom;
		
		Room kitchen = new Room(
				"Kitchen",
				"The new kitchen",
				"You enter the new kitchen, with brand new white cabinets, and a new quartz counter top."
				+ "The dining room is to your west." + "There is a family room to your east. " + 
				"To the south is the entryway.");
		rooms[2] = kitchen;
		
		Room diningRoom = new Room(
				"Dining Room",
				"The formal dining room.",
				"You enter the formal dining room, with a large table and chairs where the family gathers on holidays." 
				+ "To the west is the cozy living room. " +
				"To the south is the kitchen.");
		rooms[3] = diningRoom;
		
		Room familyRoom = new Room(
				"Family Room",
				"The comfy family room.",
				"You enter the family room with a large T.V. in the far corner of the room. " +
				"This is a dead end, please enter 'south' to enter the kitchen.");
		rooms[4] = familyRoom;
		
		Room staircase = new Room(
				"Staircase",
				"small staircase",
				"The staircase leads from the first floor up to the second floor." +
				"The staircase leads north to a small hallway leading to the bedrooms and the bathroom.");
		rooms[5] = staircase;
		
		Room smallHallway = new Room(
				"Small Hallway",
				"The small hallway",
				"The small hallway leads to the bedrooms on the second floor. " +
				"To the west is the master bedroom. " +
				"To the north is the upstairs bathroom. " +
				"To the east is the second bedroom.");
		rooms[6] = smallHallway;
		
		Room masterBedroom = new Room(
				"Master Bedroom",
				"A large master bedroom.",
				"You enter the master bedroom where the head of household sleeps. " +
				"To exit this room please enter 'south'.");
		rooms[7] = masterBedroom;
		
		Room bathroom = new Room(
				"Bathroom",
				"The upstairs bathroom",
				"You enter the bathroom. This is a dead end. To exit the upstairs bathroom, " +
				"please enter 'south'.");
		rooms[8] = bathroom;
				
		Room bedroom2 = new Room(
				"Bedroom2",
				"The second bedroom.",
				"You enter the second bedroom. This is a dead end. To exit the second bedroom, " +
				"please enter 'south'.");
		rooms[9] = bedroom2;
		
		/*
		 * west -> 0
		 * north -> 1
		 * east -> 2
		 * south -> 3
		 * 
		 * */				
		// exit arrays
		Room[] entrywayExits = {livingRoom, staircase, kitchen, null};
		entryway.setExits(entrywayExits);
		
		Room[] livingExits = {null, null, diningRoom, entryway};
		livingRoom.setExits(livingExits);
		
		Room[] kitchenExits = {diningRoom, null, familyRoom, entryway};
		kitchen.setExits(kitchenExits);
		
		Room[] diningRoomExits = {livingRoom, null, null, kitchen};
		diningRoom.setExits(diningRoomExits);
		
		Room[] familyRoomExits = {null, null, null, kitchen};
		familyRoom.setExits(familyRoomExits);
		
		Room[] staircaseExits = {null, smallHallway, null, entryway};
		staircase.setExits(staircaseExits);
		
		Room[] smallHallwayExits = {masterBedroom, bathroom, bedroom2, staircase};
		smallHallway.setExits(smallHallwayExits);
		
		Room[] bathroomExits = {null, null, null, smallHallway};
		bathroom.setExits(bathroomExits);
		
		Room[] bedroom2Exits = {null, null, null, smallHallway};
		bedroom2.setExits(bedroom2Exits);
		
		
	}

}
