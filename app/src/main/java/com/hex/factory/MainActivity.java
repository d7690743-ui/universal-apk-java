package com.hex.factory;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int taps = 0;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(32,32,32,32);
        root.setBackgroundColor(0xFF101827);
        TextView title = new TextView(this);
        title.setText("UNIVERSAL APK"); title.setTextColor(0xFFFFFFFF);
        title.setTextSize(26); title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        TextView subtitle = new TextView(this);
        subtitle.setText("Java moderno · Android nativo · GitHub Actions");
        subtitle.setTextColor(0xFFB8C5D6); subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0,16,0,32);
        final TextView status = new TextView(this);
        status.setText("Plantilla instalada correctamente.");
        status.setTextColor(0xFF64D8A5); status.setTextSize(16);
        status.setGravity(Gravity.CENTER); status.setPadding(0,0,0,24);
        Button button = new Button(this); button.setText("PROBAR PLANTILLA");
        button.setOnClickListener(v -> { taps++; status.setText("Funcionando correctamente. Pruebas: " + taps); });
        root.addView(title); root.addView(subtitle); root.addView(status); root.addView(button);
        setContentView(root);
    }
}