package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanuchPopularMovies(View view){
        Toast.makeText(this, "This button will launch my popular movies app!", Toast.LENGTH_SHORT).show();
    }

    public void lanuchStockHawk(View view){
        Toast.makeText(this, "This button will launch my stock hawk app!", Toast.LENGTH_SHORT).show();
    }

    public void lanuchBuildItBigger(View view){
        Toast.makeText(this, "This button will launch my build it bigger!", Toast.LENGTH_SHORT).show();
    }

    public void lanuchMakeApp(View view){
        Toast.makeText(this, "This button will launch my make your app material!", Toast.LENGTH_SHORT).show();
    }

    public void lanuchGoUbiquitous(View view){
        Toast.makeText(this, "This button will launch my go ubiquitous!", Toast.LENGTH_SHORT).show();
    }

    public void lanuchCapstone(View view){
        Toast.makeText(this, "This button will launch my capston app!", Toast.LENGTH_SHORT).show();
    }
}
