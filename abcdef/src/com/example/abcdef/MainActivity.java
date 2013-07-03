package com.example.abcdef;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnTouchListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		View vm = new View(this);
        vm.setOnTouchListener(this);
        setContentView(vm);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		if( event.getAction() == MotionEvent.ACTION_DOWN) 
		{
			float x = event.getX();
            float y = event.getY();
            Toast toastView = Toast.makeText(getApplicationContext(), "x = " + x + "y = " + y, Toast.LENGTH_LONG);
            toastView.setGravity(Gravity.CENTER, 10, 10);
            toastView.show();
			
			return true;
		}
			
		return false;
	}



}
