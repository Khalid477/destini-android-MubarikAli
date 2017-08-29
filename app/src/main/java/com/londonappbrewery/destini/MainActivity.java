package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mstoryTextView;
    Button mbuttonTop;
    Button mbuttonBottom;
    int mStoryIndex =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryTextView = (TextView) findViewById(R.id.storyTextView);
        mbuttonTop = (Button) findViewById(R.id.buttonTop);
        mbuttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Log.d("Destini","Top Button.........."+mStoryIndex);
                if (mStoryIndex==1 || mStoryIndex==3) {
                    mStoryIndex = (mStoryIndex + 1);
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                }else{
                    mstoryTextView.setText(R.string.T6_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }
                Log.d("Destini","Top Button END.........."+mStoryIndex);

                }

        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini","Bottom Button.........."+mStoryIndex);

                if(mStoryIndex==1) {
                    mStoryIndex = (mStoryIndex + 2);
                    mstoryTextView.setText(R.string.T2_Story);
                    mbuttonTop.setText(R.string.T2_Ans1);
                    mbuttonBottom.setText(R.string.T2_Ans2);
                }else if (mStoryIndex==2 || mStoryIndex==4){
                    mstoryTextView.setText(R.string.T5_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }else if (mStoryIndex==3){
                    mstoryTextView.setText(R.string.T4_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);

                }
                Log.d("Destini","BOTTOM BUTTON END.........."+mStoryIndex);
            }
        });



    }
}
