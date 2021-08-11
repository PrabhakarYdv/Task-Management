package com.prabhakar.layouts_design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class HomeCardActivity extends AppCompatActivity {
    private MaterialButton plushButton;
    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_card);
        plushButton = findViewById(R.id.plush_btn);
        cardView = findViewById(R.id.card1);

        plushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeCardActivity.this, CreateNewTaskActivity.class);
                startActivity(intent);
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeCardActivity.this, EditTaskActivity.class);
                startActivity(intent);
            }
        });
    }
}
