package com.example.jabels.activityresultexample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jabels.activityresultexample.R;
import com.example.jabels.activityresultexample.util.RequestCode;

public class MainActivity extends Activity {

    private Button introduceMySelfBtn;
    private Button chooseTheLanguageBtn;
    private TextView choosenLanguageTxt;
    private TextView greetingsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        greetingsTxt = (TextView) findViewById(R.id.greetingsTxt);
        choosenLanguageTxt = (TextView) findViewById(R.id.choosenLanguageTxt);

    }

    public void onShow(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.introduceMySelfBtn :
                intent = new Intent(getApplicationContext(), PresentationActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTATION);
                break;
            case R.id.chooseTheLanguageBtn :
                intent = new Intent(getApplicationContext(), LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RequestCode.REQUEST_CODE_PRESENTATION:
                    String userName = data.getStringExtra("userName");
                    greetingsTxt.setText("Glad to see you " + userName + "!");
                    break;
                case RequestCode.REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    choosenLanguageTxt.setText("Your language is: " + language);
            }
        }else {
            Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_LONG).show();
        }
    }
}