package com.example.katepillow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.katepillow.secondstage.MainActivity2;

/**Класс в котором задается вопрос:
 * У вас уже был опыт в медитации???
 */
public class ExperienceActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        button = findViewById(R.id.button_answer_yes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMainActivity2();
            }
        });

        button = findViewById(R.id.button_answer_no);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMainActivity2();
            }
        });

        button = findViewById(R.id.button_answer_yes_big_expo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMainActivity2();
            }
        });
    }
    public void moveToMainActivity2() {
        Intent intent = new Intent(ExperienceActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}