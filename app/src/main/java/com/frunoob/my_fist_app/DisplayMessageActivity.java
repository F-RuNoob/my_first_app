package com.frunoob.my_fist_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import static com.frunoob.my_fist_app.MainActivity.EXTRA_MESSAGE;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.editText);
        textView.setText(message);
    }
}