package ca.nova.airplay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.graphics.Typeface;

/** TV UI shell only. Real AirPlay receiver and pairing NOT implemented. */
public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(5894 | 1024 | 512);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setBackgroundColor(Color.rgb(14, 18, 33));
        root.setPadding(36, 36, 36, 36);
        root.addView(line("NOVA AIRPLAY", 36, Color.rgb(160, 202, 255), true));
        root.addView(line("Fire OS 5 compatibility alpha", 22, Color.WHITE, false));
        root.addView(line("Receiver not connected yet.\nThis APK cannot mirror iPhones.", 17, Color.rgb(190, 197, 210), false));
        setContentView(root);
    }
    private TextView line(String value, int sp, int color, boolean bold) {
        TextView text = new TextView(this);
        text.setText(value);
        text.setTextSize(sp);
        text.setTextColor(color);
        text.setGravity(Gravity.CENTER);
        text.setPadding(0, 12, 0, 12);
        if (bold) text.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        return text;
    }
}
