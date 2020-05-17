package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        Button mButtonTop;
        Button mButtonBottom;
        TextView mStoryTextView;
        int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryTextView = findViewById(R.id.storyTextView);
            mButtonBottom = findViewById(R.id.buttonBottom);
            mButtonTop = findViewById(R.id.buttonTop);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
                mButtonTop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(mStoryIndex == 1 || mStoryIndex == 2) {
                            Log.d("Destini", "Top button has been pressed");
                            mStoryTextView.setText(R.string.T3_Story);
                            mButtonTop.setText(R.string.T3_Ans1);
                            mButtonBottom.setText(R.string.T3_Ans2);
                            mStoryIndex = 3;
                        } else {
                            mStoryTextView.setText(R.string.T6_End);
                            mButtonTop.setVisibility(View.GONE);
                            mButtonBottom.setVisibility(View.GONE);
                        }
                    }
                });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
                mButtonBottom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(mStoryIndex == 1) {
                            Log.d("Destini", "Bottom button has been pressed");
                            mStoryTextView.setText(R.string.T2_Story);
                            mButtonTop.setText(R.string.T2_Ans1);
                            mButtonBottom.setText(R.string.T2_Ans2);
                            mStoryIndex = 2;
                        } else if(mStoryIndex == 2){
                            mStoryTextView.setText(R.string.T4_End);
                            mButtonBottom.setVisibility(View.GONE);
                            mButtonTop.setVisibility(View.GONE);
                        } else {
                            mStoryTextView.setText(R.string.T5_End);
                            mButtonBottom.setVisibility(View.GONE);
                            mButtonTop.setVisibility(View.GONE);
                        }
                    }
                });

    }


}

