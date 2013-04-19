package com.example.puzzlestrikerandomizerforandroid;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
//import android.annotation.TargetApi;

public class RandomizeBank extends Activity {
    //private GlobalInformation globalInfo;
    private final static boolean DEBUG = true;
    private void debug(String strIn){
        if (DEBUG) { System.out.println(strIn); }
    }

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        //globalInfo = (GlobalInformation)getApplicationContext();
        Bundle intentExtras = getIntent().getExtras();
        ArrayList<String> randomedChipNames = intentExtras.getStringArrayList(MainActivity.RANDOMED_CHIPS);
        setContentView(R.layout.activity_randomize_bank);

        int[] titleIDs = { R.id.chipTitle0, R.id.chipTitle1, R.id.chipTitle2,
				R.id.chipTitle3, R.id.chipTitle4, R.id.chipTitle5,
				R.id.chipTitle6, R.id.chipTitle7, R.id.chipTitle8,
				R.id.chipTitle9 };

		int[] imageIDs = { R.id.chipImage0, R.id.chipImage1, R.id.chipImage2,
				R.id.chipImage3, R.id.chipImage4, R.id.chipImage5,
				R.id.chipImage6, R.id.chipImage7, R.id.chipImage8,
				R.id.chipImage9
		};
        for(int i = 0; i < MainActivity.BANKSIZE; i++){
            String curChipName = randomedChipNames.get(i);
            Chip curChip = new Chip(curChipName);
            TextView curText = (TextView)findViewById(titleIDs[i]);
            curText.setText(curChip.getName());
            ImageView curImage = (ImageView)findViewById(imageIDs[i]);
            curImage.setImageResource(curChip.getImageID());
        }
    }

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    /*
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.randomize_bank, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
