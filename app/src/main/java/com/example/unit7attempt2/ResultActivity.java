package com.example.unit7attempt2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class ResultActivity extends AppCompatActivity {

    TextView flNeeded;
    String flLength;
    String flWidth;
    CalculateFlooring cf = new CalculateFlooring();

    public static final String FLOORWIDTH_KEY = "FLOORINGWIDTH_KEY";
    public static final String FLOORLENGTH_KEY = "FLOORINGLENGTH_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        flNeeded = findViewById(R.id.textViewOutcome);

        Bundle extras = getIntent().getExtras();


        flLength = extras.getString(FLOORLENGTH_KEY);
        flWidth = extras.getString(FLOORWIDTH_KEY);

        cf.setFloorLength(Double.parseDouble(flLength));
        cf.setFloorWidth(Double.parseDouble(flWidth));

        flNeeded.setText(getResources().getString(R.string.note1) + cf.getFloorWidth() + getResources().getString(R.string.note2) + cf.getFloorLength() + getResources().getString(R.string.note3) + cf.FloorCalc() + getResources().getString(R.string.note4));

        //With a width of ? feet, and a length of ? feet, you need ? sqare feet of flooring.
    }
}
