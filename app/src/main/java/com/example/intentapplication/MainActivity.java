package com.example.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edit_text);
        final String address = editText.getText().toString();
        Button send = findViewById(R.id.send);
        Button call = findViewById(R.id.call);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("text/plain" + address));
                startActivity(SendIntent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent DialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + address));
                startActivity(DialIntent);
            }
        });


    }

    void setAction() {

    }
}