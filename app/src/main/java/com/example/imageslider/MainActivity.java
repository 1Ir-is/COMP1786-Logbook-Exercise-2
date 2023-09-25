package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button nextButton, previousButton;
    int i = 0;

    private final int[] imageResources = {
        R.drawable.image1, R.drawable.image2,
        R.drawable.image3, R.drawable.image4,
        R.drawable.image5, R.drawable.image6,
        R.drawable.image7, R.drawable.image8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageViewSlider);
        previousButton = findViewById(R.id.Previous);
        nextButton = findViewById(R.id.Next);

        // Initialize i to 0 to start with the first image
        i = 0;

        // Initially hide the "Previous" button
        previousButton.setVisibility(View.GONE);

        // Set the initial image
        imageView.setImageResource(imageResources[i]);

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Decrease i and update the image
                i--;
                imageView.setImageResource(imageResources[i]);

                // Handle button visibility
                previousButton.setVisibility(i > 0 ? View.VISIBLE : View.GONE);
                nextButton.setVisibility(View.VISIBLE);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Increase i and update the image
                i++;
                imageView.setImageResource(imageResources[i]);

                // Handle button visibility
                previousButton.setVisibility(View.VISIBLE);
                nextButton.setVisibility(i < imageResources.length - 1 ? View.VISIBLE : View.GONE);
            }
        });
    }
}
