package com.example.home_work_3_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtTheme;
    private EditText edtMessage;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edt_email);
        edtTheme = findViewById(R.id.edt_themes);
        edtMessage = findViewById(R.id.edt_message);
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(view -> {
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setType("plain/text");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{edtEmail.getText().toString()});
            intent.putExtra(Intent.EXTRA_SUBJECT, edtTheme.getText().toString());
            intent.putExtra(Intent.EXTRA_TEXT, edtMessage.getText().toString());
            startActivity(intent);
        });
    }

}