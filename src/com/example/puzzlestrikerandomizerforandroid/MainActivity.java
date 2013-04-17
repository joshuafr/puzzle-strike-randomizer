package com.example.puzzlestrikerandomizerforandroid;



import java.util.ArrayList;
import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.puzzlestrikerandomizer.MESSAGE";
	private GlobalInformation globalInfo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		globalInfo = (GlobalInformation)getApplicationContext();
		//	final Button button = (Button) findViewById(R.id.button_id);
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
		BaseChips baseChips = new BaseChips();
		System.out.println("randomzieBank");
		globalInfo.emptyRandomChips();
		//EditText editText = (EditText) findViewById(R.id.edit_message);
		//String message = editText.getText().toString();
		Random rand = new Random();
		//String message = "";
		ArrayList<Chip> chipList = new ArrayList<Chip>();
		/*For now I'm just throwing all the chips in at once. Later, this will
		 *be refined to take account of themed picks (lots of attacks,
		 *balanced bank, ect.)*/
		chipList.add(baseChips.new ChipDamage());
		chipList.add(baseChips.new CombosAreHard());
		chipList.add(baseChips.new DrawThree());
		chipList.add(baseChips.new GemEssence());
		chipList.add(baseChips.new GemstoGemonade());
		chipList.add(baseChips.new IronDefense());
		chipList.add(baseChips.new ItsaTrap());
		chipList.add(baseChips.new ItsComboTime());
		chipList.add(baseChips.new Knockdown());
		chipList.add(baseChips.new MasterPuzzler());
		chipList.add(baseChips.new MixMaster());
		chipList.add(baseChips.new OneofEach());
		chipList.add(baseChips.new OneTwoPunch());
		chipList.add(baseChips.new ReallyAnnoying());
		chipList.add(baseChips.new Recklessness());
		chipList.add(baseChips.new RiskyMove());
		chipList.add(baseChips.new Roundhouse());
		chipList.add(baseChips.new SalePrices());
		chipList.add(baseChips.new SecretMove());
		chipList.add(baseChips.new SelfImprovement());
		chipList.add(baseChips.new SneakAttack());
		chipList.add(baseChips.new StolenPurples());
		chipList.add(baseChips.new ThinkingAhead());
		chipList.add(baseChips.new TrainingDay());
		for(int i = 0; i < globalInfo.getBankSize(); i++){
			int randInt = rand.nextInt(chipList.size());	
			globalInfo.addChipToRandom(chipList.get(randInt));
			chipList.remove(randInt);
		}
		//intent.putExtra(EXTRA_MESSAGE,  message);
		//System.out.println(message);
		Intent intent = new Intent(this, RandomizeBank.class);
		startActivity(intent);
	}

}

