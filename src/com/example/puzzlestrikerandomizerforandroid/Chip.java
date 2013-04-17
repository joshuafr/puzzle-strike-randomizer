package com.example.puzzlestrikerandomizerforandroid;

import java.util.ArrayList;

//Represents the attributes of a given chip, which will be used for different
//options in the randomizer. For example, a "lots of attacks" theme might 
//direct the randomizer to generate banks with more chips with the "red fist"
//attribute. 
//This is abstract because I intent to make a subclass for each type of chip
public abstract class Chip {
	protected String name;
	//protected BufferedImage image;
	
	protected int imageID;
	
	//Which set a given set comes from: common, base, upgrade, Shadows, ect.
	protected String set;
	
	//Colors stored as a list because chips may be multicolor
	//Possible colors: "Brown", "Blue", "Red", "Purple", "Black"
	protected ArrayList<String> chipColors;
	
	//chipTypes also stored as a list because chips may be multiple types
	//Possible chipTypes: "Purple Orb", "Red Fist", "Blue Shield", 
	//"Brown Shield", "Purple Shield", "!"
	protected ArrayList<String> chipTypes;
	
	public String toString(){
		return name;	
	}
	
	//Getters
	public String getName(){ return name; }
	public int getImageID() { return imageID; }
	public String getSet() { return set; }
	//Figure out how I need to deal with colors/types when I get there

}
