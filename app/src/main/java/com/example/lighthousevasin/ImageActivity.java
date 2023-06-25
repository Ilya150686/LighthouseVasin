package com.example.lighthousevasin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imageView = findViewById(R.id.image_view);
        textView = findViewById(R.id.text_view);

        Intent intent = getIntent();
        int imageResId = intent.getIntExtra("image", 0);
        String text = intent.getStringExtra("text");

        imageView.setImageResource(imageResId);
        textView.setText(text);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}