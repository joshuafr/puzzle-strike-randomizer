package com.example.puzzlestrikerandomizerforandroid;



import java.util.ArrayList;
import java.util.Random;
import android.os.Bundle;
import android.os.Parcel;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String RANDOMED_CHIPS = "com.example.puzzlestrikerandomizer.RANDOMED_CHIPS";
	public final static int BANKSIZE = 10; //to avoid magic numbers
	
	private final static boolean DEBUG = true;
	private void debug(String strIn){
		if (DEBUG) { System.out.println(strIn); }
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//globalInfo = (GlobalInformation)getApplicationContext();
	}

	/*
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}
	 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void randomizeBank(View view) {
		//BaseChips baseChips = new BaseChips();
		Random rand = new Random();
		//Parcel parcel1 = Parcel.obtain();
		ArrayList<Chip> chipList = new ArrayList<Chip>();
		//Chips are reconsdtructed from their names in the Randomize Bank 
		//Activity, so for simplicity that's all I'm passing.
		ArrayList<String> randomedChipNames = new ArrayList<String>();
		/*For now I'm just throwing all the chips in at once. Later, this will
		 *be refined to take account of themed picks (lots of attacks,
		 *balanced bank, ect.)*/
		chipList.add(new Chip("Chip Damage"));
		chipList.add(new Chip("Combos Are Hard"));
		chipList.add(new Chip("Draw Three"));
		chipList.add(new Chip("Gem Essence"));
		chipList.add(new Chip("Gems to Gemonade"));
		chipList.add(new Chip("Iron Defense"));
		chipList.add(new Chip("It's a Trap"));
		chipList.add(new Chip("It's Combo Time"));
		chipList.add(new Chip("Knockdown"));
		chipList.add(new Chip("Master Puzzler"));
		chipList.add(new Chip("Mix Master"));
		chipList.add(new Chip("One of Each"));
		chipList.add(new Chip("One-Two Punch"));
		chipList.add(new Chip("Really Annoying"));
		chipList.add(new Chip("Recklessness"));
		chipList.add(new Chip("Risky Move"));
		chipList.add(new Chip("Roundhouse"));
		chipList.add(new Chip("Sale Prices"));
		chipList.add(new Chip("Secret Move"));
		chipList.add(new Chip("Self Improvement"));
		chipList.add(new Chip("Sneak Attack"));
		chipList.add(new Chip("Stolen Purples"));
		chipList.add(new Chip("Thinking Ahead"));
		chipList.add(new Chip("Training Day"));
		for(int i = 0; i < BANKSIZE; i++){
			int randInt = rand.nextInt(chipList.size());
			Chip randomedChip = chipList.get(randInt);
			randomedChipNames.add(randomedChip.getName());
			//randomedChip.writeToParcel(parcel1, 0);
			//randomedChips.add(chipList.get(randInt));
			//globalInfo.addChipToRandom(chipList.get(randInt));
			chipList.remove(randInt);
		}
		Intent intent = new Intent(this, RandomizeBank.class);
		//(RANDOMED_CHIPS, parcel1);
		//INSERT randomedChips INTO extras HERE
		debug(randomedChipNames.toString());
		intent.putStringArrayListExtra(RANDOMED_CHIPS, randomedChipNames);
		debug("CHECK1");
		startActivity(intent);
	}

}

