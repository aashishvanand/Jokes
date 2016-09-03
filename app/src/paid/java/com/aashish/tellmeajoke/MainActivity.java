package com.aashish.tellmeajoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aashish.jokedisplay.DisplayActivity;

public class MainActivity extends AppCompatActivity implements GCEAsync.Callback  {

    Button Tellajoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tellajoke = (Button) findViewById(R.id.button_joke);
        Tellajoke.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                getFetchJoke();
        }
        }
        );

    }

    private void getFetchJoke(){
        new GCEAsync(this).execute();
    }


    @Override
    public void onFinished(String result) {
        Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
        intent.putExtra("Joke",result);
        String Product="Paid";
        intent.putExtra("Product",Product);
        startActivity(intent);
    }
}
