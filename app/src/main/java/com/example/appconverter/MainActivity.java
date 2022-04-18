package com.example.appconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    double conversionRate = 2.2;
    double weightEntered;
    double convertedWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText weight = (EditText) findViewById(R.id.txtweight);
        final RadioButton kilo = (RadioButton) findViewById(R.id.clbstoKG);
        final RadioButton pound = (RadioButton) findViewById(R.id.cKgtolbs);
        final TextView result = (TextView) findViewById(R.id.txtweight);
        Button convert = (Button) findViewById(R.id.converter);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weightEntered=Double.parseDouble(weight.getText().toString());
                DecimalFormat tenth= new DecimalFormat("#.#");

                if(kilo.isChecked()){
                   if(weightEntered<=500){
                       convertedWeight=weightEntered/conversionRate;
                       result.setText(tenth.format(convertedWeight)+ "kilograms");

                }
                else{

                       Toast.makeText(MainActivity.this, "Pounds must be less than 500", Toast.LENGTH_LONG).show();


            }
        }


                if(pound.isChecked()){
                    if(weightEntered<=325){
                        convertedWeight=weightEntered*conversionRate;
                        result.setText(tenth.format(convertedWeight)+ "pounds");

                    }
                    else{

                        Toast.makeText(MainActivity.this, "Kilos must be less than 325", Toast.LENGTH_LONG).show();


                    }
                }








}});
    }
}


























