package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView txt;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Widgets
        txt = findViewById(R.id.result);

        editText = findViewById(R.id.enterValue);

        btn1 = findViewById(R.id.cnvrttoPOUNDS);

        //Adding a click event for button (Executing the convert method when clicked)
        btn1.setOnClickListener(v -> {
            //Calling ConvertFromMeterToInch
            ConvertFromMeterToPOUNDS();
        });
    }

    private void ConvertFromMeterToPOUNDS() {
        //This method will convert the values in edittext
        //From KG to POUND
        String valueEnterInMeter = editText.getText().toString();
        //Converting String to a number
        double KG = Double.parseDouble(valueEnterInMeter);

        //Converting meter to cm formula
        double pound = KG * 2.205;
        //Displaying Result
        txt.setText(pound + " POUNDS");
    }

}