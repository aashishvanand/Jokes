package com.aashish.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class DisplayActivity extends AppCompatActivity {

    TextView Jokedisplay;
    String Joke;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity);
        Jokedisplay = (TextView) findViewById(R.id.joke_display);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Joke = null;
            } else {
                Joke = extras.getString("Joke");
            }
        }else {
                Joke= (String) savedInstanceState.getSerializable("Joke");
            }
        Jokedisplay.setText(Joke);

        back = (Button) findViewById(R.id.button_back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            finish();
            }
        }
        );

    }
}
