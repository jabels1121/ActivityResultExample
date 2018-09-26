package com.example.jabels.activityresultexample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jabels.activityresultexample.R;

public class PresentationActivity extends Activity {

    private EditText userNameInputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presentation_layout);

        userNameInputField = (EditText) findViewById(R.id.userNameInputField);

    }

    public void introduce(View v) {
        Intent intent = new Intent();
        intent.putExtra("userName", userNameInputField.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
