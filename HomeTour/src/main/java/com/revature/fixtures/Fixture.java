package com.revature.fixtures;

/*
 * Used as a base for anything that can be looked at or interacted with
 * Should have these following properties:
 * 		- String name: a short name / title for the fixture
 * 		- String shortDescription: a one-sentence-long description of the fixture
 * 								used to briefly mention the fixture
 * 		- String longDescription: a paragraph-long description of the thing, 
 * 								displayed when the player investigates the fixture 
 * 								thoroughly (looks at it, or enters room)
 * 
 * */


public abstract class Fixture {
	
	public String name;
	public String shortDescription;
	public String longDescription;
	

	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String getLongDescription() {
		return longDescription;
	}
	
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public String toString() {
		return "Fixture [name=" + name + ", shortDescription=" + shortDescription + ", longDescription="
				+ longDescription + "]";
	}
	
	
	
	
	
}
