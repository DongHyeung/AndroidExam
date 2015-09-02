package com.android.example.androidexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayoutActivity extends AppCompatActivity {

    private Button mChangeBtn;
    private ImageView mImageView1;
    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        mChangeBtn = (Button)findViewById(R.id.change_Button);
        mImageView1 = (ImageView)findViewById(R.id.image1);
        mImageView2 = (ImageView)findViewById(R.id.image2);

        mChangeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chageImage();
            }
        });
    }

    public void chageImage(){
        if(mImageView1.getVisibility() == View.VISIBLE) {

            mImageView1.setVisibility(View.INVISIBLE);
            mImageView2.setVisibility(View.VISIBLE);
        } else if(mImageView2.getVisibility() == View.VISIBLE){

            mImageView2.setVisibility(View.INVISIBLE);
            mImageView1.setVisibility(View.VISIBLE);
        }
    }
}
