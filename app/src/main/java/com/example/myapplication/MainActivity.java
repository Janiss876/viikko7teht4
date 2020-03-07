package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        edText = (EditText) findViewById(R.id.editText);

        edText.addTextChangedListener(txtwatcher);

    }
    private TextWatcher txtwatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String textInput = edText.getText().toString();
            text.setText(textInput);
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


}