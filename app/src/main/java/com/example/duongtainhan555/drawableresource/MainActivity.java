package com.example.duongtainhan555.drawableresource;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgClip;
    private Button btnClip;
    private ClipDrawable clipDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anh xa
        imgClip = findViewById(R.id.imgDrawableClip);
        btnClip = findViewById(R.id.btnClip);

        clipDrawable = (ClipDrawable) imgClip.getDrawable();
        clipDrawable.setLevel(1000);
        imgClip.setImageLevel(1000);
        btnClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clipDrawable.setLevel(clipDrawable.getLevel()+1000);
            }
        });
    }
}
