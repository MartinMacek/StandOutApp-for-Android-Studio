package com.example.martin.MyApplication;

import wei.mark.standout.StandOutWindow;
import android.app.Activity;
import android.os.Bundle;

public class StandOutExampleActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		StandOutWindow.closeAll(this, SimpleWindow.class);
		StandOutWindow.closeAll(this, MultiWindow.class);
		StandOutWindow.closeAll(this, WidgetsWindow.class);
		StandOutWindow.closeAll(this, MostBasicWindow.class);

		// show a MultiWindow, SimpleWindow
//
//		StandOutWindow.show(this, SimpleWindow.class, StandOutWindow.DEFAULT_ID);
//		StandOutWindow.show(this, MultiWindow.class, StandOutWindow.DEFAULT_ID);
//		StandOutWindow.show(this, WidgetsWindow.class,	StandOutWindow.DEFAULT_ID);

		// show a MostBasicWindow. It is commented out because it does not
		// support closing.

		  StandOutWindow.show(this, MostBasicWindow.class, StandOutWindow.DEFAULT_ID);

		finish();
	}
}