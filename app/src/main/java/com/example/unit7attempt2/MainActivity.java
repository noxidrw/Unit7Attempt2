package com.example.unit7attempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWidth;
    TextView tvLength;

    public static final String FLOORWIDTH_KEY = "FLOORINGWIDTH_KEY";
    public static final String FLOORLENGTH_KEY = "FLOORINGLENGTH_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLength = findViewById(R.id.editTextRoomLength);
        tvWidth = findViewById(R.id.editTextRoomWidth);

    }

    public void btnShowResult(View view){
        if(!tvLength.getText().toString().equals("") && !tvWidth.getText().toString().equals("")) {
            // Call the calculate flooring activity using an intent
            Intent flrCalcIntent = new Intent(MainActivity.this, ResultActivity.class);
            flrCalcIntent.putExtra(FLOORWIDTH_KEY, tvWidth.getText() + "");
            flrCalcIntent.putExtra(FLOORLENGTH_KEY, tvLength.getText() + "");
            startActivity(flrCalcIntent);
        }

    }
}
