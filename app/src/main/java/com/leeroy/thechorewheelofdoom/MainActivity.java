package com.leeroy.thechorewheelofdoom;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.leeroy.thechorewheelofdoom.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView lessThan10Result;
    private Button lessThan10;
    private Button greaterThan10;
    private String[] greaterThan10Choices;
    private String[] lessThan10Choices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lessThan10Choices = new String[] {"Pick up floor", "pick up counter and table",};
        greaterThan10Choices = new String[] {"Sweep/mop", "Put away dishes", "Do the dishes", "Clean counters and table"};


        lessThan10 = findViewById(R.id.ageLessThan10);
        lessThan10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lessThan10Length = lessThan10Choices.length;
                Random random = new Random();
                int randomNum = random.nextInt(lessThan10Length);
                lessThan10Result = (TextView) findViewById(R.id.lessThan10Result);
                lessThan10Result.setText(lessThan10Choices[randomNum]);


                }

        });
    }

}
