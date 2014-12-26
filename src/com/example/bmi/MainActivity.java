package com.example.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	EditText editText1;
	Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText)findViewById(R.id.editText1);
        button1 = (Button) findViewById(R.id.button1);
    }

public void Calc(View view){
	double w = Double.parseDouble(editText1.getText().toString());
	double value = w*9/5+32;
	TextView textView1=(TextView)findViewById(R.id.textView1);
	textView1.setText(String.valueOf(value)+"溫度計轉換 4020D093李昱瑭製作");
		}
	}
