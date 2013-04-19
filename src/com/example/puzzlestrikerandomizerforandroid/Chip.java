package com.example.puzzlestrikerandomizerforandroid;

import java.util.ArrayList;
import java.util.Arrays;

//import android.os.Parcel;
//import android.os.Parcelable;

//Represents the attributes of a given chip, which will be used for different
//options in the randomizer. For example, a "lots of attacks" theme might 
//direct the randomizer to generate banks with more chips with the "red fist"
//attribute. 
//This is abstract because I intent to make a subclass for each type of chip
public class Chip{
    private String name;
    private int imageID;
    //Which set a given set comes from: common, base, upgrade, Shadows, ect.
    private String set;
    //Colors stored as a list because chips may be multicolor
    //Possible colors: "Brown", "Blue", "Red", "Purple", "Black"
    private ArrayList<String> chipColors;
    //chipTypes also stored as a list because chips may be multiple types
    //Possible chipTypes: "Purple Orb", "Red Fist", "Blue Shield", 
    //"Brown Shield", "Purple Shield", "!"
    private ArrayList<String> chipTypes;
    private String[] validNameArray = {"Chip Damage", "Combos Are Hard", 
            "Draw Three", "Gem Essence", "Gems to Gemonade", "Iron Defense",
            "It's a Trap", "It's Combo Time", "Knockdown", "Master Puzzler",
            "Mix Master", "One of Each", "One-Two Punch", "Really Annoying",
            "Recklessness", "Risky Move", "Roundhouse", "Sale Prices",
            "Secret Move", "Self Improvement", "Sneak Attack", 
            "Stolen Purples", "Thinking Ahead", "Training Day"
    };
    private ArrayList<String> validNames = new ArrayList<String>(Arrays.asList(validNameArray));

    public Chip(String newChipName){
        if (validNames.contains(newChipName)){
            name = newChipName;
            if (name.equals("Chip Damage")){
                imageID = R.drawable.chipdamage;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("redfist");
                chipColors = new ArrayList<String>();
                chipColors.add("red");
            } else if (name.equals("Combos Are Hard")){
                imageID = R.drawable.combosarehard;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("Draw Three")){
                imageID = R.drawable.drawthree;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("Gem Essence")){
                imageID = R.drawable.gemessence;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("Gems to Gemonade")){
                imageID = R.drawable.gemstogemonade;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("purpleshield");
                chipColors = new ArrayList<String>();
                chipColors.add("purple");
            } else if (name.equals("Iron Defense")){
                imageID = R.drawable.irondefense;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("It's a Trap")){
                imageID = R.drawable.itsatrap;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("It's Combo Time")){
                imageID = R.drawable.itscombotime;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("Knockdown")){
                imageID = R.drawable.knockdown;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("redfist");
                chipColors = new ArrayList<String>();
                chipColors.add("red");
            } else if (name.equals("Master Puzzler")){
                imageID = R.drawable.masterpuzzler;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("!");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("Mix Master")){
                imageID = R.drawable.mixmaster;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("redfist");
                chipColors = new ArrayList<String>();
                chipColors.add("red");
                chipColors.add("purple");
            } else if (name.equals("One of Each")){
                imageID = R.drawable.oneofeach;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("One-Two Punch")){
                imageID = R.drawable.onetwopunch;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (name.equals("Really Annoying")){
                imageID = R.drawable.reallyannoying;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("redfist");
                chipTypes.add("blueshield");
                chipColors = new ArrayList<String>();
                chipColors.add("red");
                chipColors.add("blue");
            } else if (newChipName.equals("Recklessness")){
                name = "Recklessness";
                imageID = R.drawable.recklessness;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (newChipName.equals("Risky Move")){
                name = "Risky Move";
                imageID = R.drawable.riskymove;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("redfist");
                chipColors = new ArrayList<String>();
                chipColors.add("red");
            } else if (newChipName.equals("Roundhouse")){
                name = "Roundhouse";
                imageID = R.drawable.roundhouse;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (newChipName.equals("Sale Prices")){
                name = "Sale Prices";
                imageID = R.drawable.saleprices;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (newChipName.equals("Secret Move")){
                name = "Secret Move";
                imageID = R.drawable.secretmove;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("ongoing");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            } else if (newChipName.equals("Self Improvement")){
                name = "Self Improvement";
                imageID = R.drawable.selfimprovement;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("blueshield");
                chipColors = new ArrayList<String>();
                chipColors.add("blue");
            } else if (name.equals("Sneak Attack")){
                imageID = R.drawable.sneakattack;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("redfist");
                chipColors = new ArrayList<String>();
                chipColors.add("red");
            } else if (name.equals("Stolen Purples")){
                imageID = R.drawable.stolenpurples;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("redfist");
                chipColors = new ArrayList<String>();
                chipColors.add("red");
            } else if (name.equals("Thinking Ahead")){
                imageID = R.drawable.thinkingahead;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("blueshield");
                chipColors = new ArrayList<String>();
                chipColors.add("blue");
            } else if (name.equals("Training Day")){
                imageID = R.drawable.trainingday;
                set = "Basic";
                chipTypes = new ArrayList<String>();
                chipTypes.add("none");
                chipColors = new ArrayList<String>();
                chipColors.add("brown");
            }
        } else {
            System.out.println("Invalid chip name: " + newChipName);
            System.out.println("Valid names: " + validNames.toString());
            throw new IllegalArgumentException();
        }
    }


    public String toString(){ return name; }

    //Getters
    public String getName(){ return name; }
    public int getImageID() { return imageID; }
    public String getSet() { return set; }
    //Figure out how I need to deal with colors/types when I get there
}
