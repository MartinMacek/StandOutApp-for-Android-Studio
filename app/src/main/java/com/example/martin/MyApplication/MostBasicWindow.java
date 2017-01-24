package com.example.martin.MyApplication;

import wei.mark.standout.StandOutWindow;
import wei.mark.standout.ui.Window;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MostBasicWindow extends StandOutWindow {

		TextView textView;

	@Override
	public String getAppName() {
		return "MostBasicWindow";
	}

	@Override
	public int getAppIcon() {
		return android.R.drawable.btn_star;
	}

	@Override
//	public void createAndAttachView(int id, FrameLayout frame) {
//		TextView view = new TextView(this);
//		view.setText("MostBasicWindow");
//		view.setBackgroundColor(Color.CYAN);
//
//		frame.addView(view);
//	}
	public void createAndAttachView(int id, FrameLayout frame) {
		// create a new layout from body.xml
		LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.body, frame, true);
	}

	public void toggled(View view) {

		boolean checked = ((ToggleButton) view).isChecked();
		if (checked)
		{
//			// Obtain MotionEvent object
//			long downTime = SystemClock.uptimeMillis();
//			long eventTime = SystemClock.uptimeMillis() + 100;
//			float x = 1000.0f;
//			float y = 1000.0f;
//// List of meta states found here:     developer.android.com/reference/android/view/KeyEvent.html#getMetaState()
//			int metaState = 0;
//			MotionEvent motionEvent = MotionEvent.obtain(
//					downTime,
//					eventTime,
//					MotionEvent.ACTION_BUTTON_PRESS,
//					x,
//					y,
//					metaState
//			);
//
//// Dispatch touch event to view
//			view.dispatchTouchEvent(motionEvent);


		}
	}

	@Override
	public StandOutLayoutParams getParams(int id, Window window) {
		return new StandOutLayoutParams(id, 800, 800, 100, 100);
	}

}
