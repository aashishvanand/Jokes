package com.aashish.tellmeajoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aashish.Joke;
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
        //if failed to connect to server load from internal library
        if(result.equals("failed to connect to /10.0.0.2 (port 8080) after 20000ms"))
        {
            Joke joke = new Joke();
            Toast.makeText(MainActivity.this, "Cannot connect to server loading jokes locally", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
            intent.putExtra("Joke", joke.getJoke());
            String product = "Paid";
            intent.putExtra("Product", product);
            startActivity(intent);
        }
        //else load from GCE
        else {
            Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
            intent.putExtra("Joke", result);
            String product = "Paid";
            intent.putExtra("Product", product);
            startActivity(intent);
        }
    }
}
