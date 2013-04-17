package com.example.puzzlestrikerandomizerforandroid;

import java.util.ArrayList;
import android.app.Application;

/*This class is intended to hold information that I want available to all
 *Activities in my application. Initial plans are for this class to hold 
 *information from the options menu as well as pass the chosen randomized
 *chips from MainActivity to RandomizeBank.
 *Credit where credit is due. Based on Tony Lukasavage tutorial located at:
 *http://savagelook.com/blog/android/android-extending-application-to-handle-global-configuration
 */
public class GlobalInformation extends Application{
	private ArrayList<Chip> randomChips;
	private static final int BANKSIZE = 10;//to avoid magic numbers
	
	@Override
	public void onCreate() {
		randomChips = new ArrayList<Chip>();
		//Will want to load information from saved default options here later
		super.onCreate();
	}
	
	/* CHIP RANDOMIZATION 
	 *Actual randomization is done in MainActivity; this class is only intended
	 *to be used to transfer data between activities. */
	//Short util functions
	public void addChipToRandom(Chip chipIn){randomChips.add(chipIn);}
	public ArrayList<Chip> getRandomChips(){return randomChips;}
	public void emptyRandomChips(){randomChips = new ArrayList<Chip>();}
	
	//Other util functions
	public int getBankSize(){
		return BANKSIZE;
	}
	
	
	

}
