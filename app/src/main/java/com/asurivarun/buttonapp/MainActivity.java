package com.asurivarun.buttonapp;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText responseText;
    EditText response2Text;
    TextView displayText;
    TextView display2Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.responseEditText);
        response2Text=findViewById(R.id.response2EditText);
        displayText=findViewById(R.id.textBox);
        display2Text=findViewById(R.id.text2Box);
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    responseText.setHint("");
                }
            }
        });
        response2Text.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    response2Text.setHint("");
                }
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Terminal");
                Log.i("testButton","Log: "+responseText.getText().toString() + " " + response2Text.getText().toString());
                System.out.println(displayText.getText());
                if(displayText.getText().equals("*insert text")) {
                    displayText.setText("");
                }
                displayText.setText(displayText.getText() + "" + responseText.getText() + "" + response2Text.getText());
                display2Text.setText((Integer.parseInt(display2Text.getText().toString())+1) + "");
            }
        });
    }
}
