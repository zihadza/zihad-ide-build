package com.zihad.hossen;
import android.app.Activity; import android.os.Bundle; import android.widget.TextView; import android.view.Gravity;
public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle s) { super.onCreate(s);
        TextView tv = new TextView(this); tv.setText("Hello from Nzsjx"); tv.setTextSize(24);
        tv.setTextColor(0xFFFFFFFF); tv.setBackgroundColor(0xFF0F172A);
        tv.setGravity(Gravity.CENTER); setContentView(tv);
    }
}