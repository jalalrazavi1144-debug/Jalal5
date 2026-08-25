package com.jalal.app;
import android.app.*;import android.os.*;import android.widget.*;
public class MainActivity extends Activity{public void onCreate(Bundle b){super.onCreate(b);TextView t=new TextView(this);t.setText("Jalal\nبرنامه ریزی روزانه");t.setTextSize(28);setContentView(t);}}
