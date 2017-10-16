package com.example.swagata.lockscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textview);
    }

    public void numberOnClick(View view) {
        text.append("*");
        if (text.getText().length()>3) {
            startActivity(new Intent(this, ImageActivity.class));
        }
    }
}
