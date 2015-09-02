
package com.android.example.androidexam.mission;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.example.androidexam.R;

public class Mission01Activity extends AppCompatActivity {

    private Button mChangeBtn1;
    private Button mChangeBtn2;
    private ImageView mImageView1;
    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission01);

        mChangeBtn1 = (Button) findViewById(R.id.btn1);
        mChangeBtn2 = (Button) findViewById(R.id.btn2);
        mImageView1 = (ImageView) findViewById(R.id.image1);
        mImageView2 = (ImageView) findViewById(R.id.image2);

        mChangeBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chageImage1();
            }
        });

        mChangeBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chageImage2();
            }
        });
    }

    public void chageImage1() {
        if (mImageView2.getVisibility() == View.VISIBLE) {

            mImageView2.setVisibility(View.INVISIBLE);
            mImageView1.setVisibility(View.VISIBLE);
        }

    }

    public void chageImage2() {
        if (mImageView1.getVisibility() == View.VISIBLE) {

            mImageView1.setVisibility(View.INVISIBLE);
            mImageView2.setVisibility(View.VISIBLE);
        }

    }
}
