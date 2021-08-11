package com.prabhakar.layouts_design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.button.MaterialButton;

public class HomeActivity extends AppCompatActivity {
    private MaterialButton plushButton;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        plushButton = findViewById(R.id.plush_btn);
        cardView = findViewById(R.id.card1);

        plushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CreateNewTaskActivity.class);
                startActivity(intent);
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, EditTaskActivity.class);
                startActivity(intent);
            }
        });
    }
}