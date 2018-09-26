package com.example.jabels.activityresultexample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jabels.activityresultexample.R;
import com.example.jabels.activityresultexample.util.Languages;

public class LanguageActivity extends Activity {

    private Button btnRussianLanguage;
    private Button btnEnglishLanguage;
    private Button btnUkraineLanguage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_layout);
    }

    public void onSelectedLanguage(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnRussianLanguage:
                intent = new Intent();
                intent.putExtra("language", Languages.RUSSIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btnEnglishLanguage:
                intent = new Intent();
                intent.putExtra("language", Languages.ENGLISH.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btnUkraineLanguage:
                intent = new Intent();
                intent.putExtra("language", Languages.UKRAINE.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }
}
