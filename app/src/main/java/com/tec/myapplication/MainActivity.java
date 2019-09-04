package com.tec.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tomer.fadingtextview.FadingTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    protected void initComponents(){
        final Button heelloButton                 = findViewById(R.id.helloMainButton);
        final FadingTextView helloFindingTextView = findViewById(R.id.helloMainFindingTextView);
        final ConstraintLayout helloConstraintLAyout    = findViewById(R.id.helloMainConstraintLAyout);

        heelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (helloConstraintLAyout.getVisibility() != View.VISIBLE){
                    heelloButton.setText("Dejar de saludar");
                    helloConstraintLAyout.setVisibility(View.VISIBLE);
                }
                else{
                    heelloButton.setText("Saludar");
                    helloConstraintLAyout.setVisibility(View.INVISIBLE);
                }


            }
        });
    }
}
