package com.example.lab3r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ImageView imageView;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);
        final String str[]={"Michelangelo","Donatello","Rafael","Leonardo"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_dropdown_item_1line,str);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(str[0].equals(spinner.getItemAtPosition(i).toString())){
                    imageView.setImageResource(R.drawable.michelangelo);
                    Toast.makeText(adapterView.getContext(),"You Choose "+str[0],Toast.LENGTH_SHORT).show();
                    Toast.makeText(adapterView.getContext(),"Abbreviated as (Mikey) or (Mike), he is a fictional character, and the third person in the Teenage Mutant Ninja Turtles series.",Toast.LENGTH_LONG).show();


                }else if(str[1].equals(spinner.getItemAtPosition(i).toString())){
                    imageView.setImageResource(R.drawable.donatello);
                    Toast.makeText(adapterView.getContext(),"You Choose "+str[1],Toast.LENGTH_LONG).show();
                    Toast.makeText(adapterView.getContext(),"Abbreviated as  (Don) or (Donnie), and he is a fictional character, and the fourth character in the Teenage Mutant Ninja Turtles series.",Toast.LENGTH_LONG).show();



                }else if(str[2].equals(spinner.getItemAtPosition(i).toString())){
                    imageView.setImageResource(R.drawable.rafael);
                    Toast.makeText(adapterView.getContext(),"You Choose "+str[2],Toast.LENGTH_LONG).show();
                    Toast.makeText(adapterView.getContext(),"Abbreviated as (RAf), which is the second main character of the Teenage Mutant Ninja Turtles series.",Toast.LENGTH_LONG).show();



                }else if(str[3].equals(spinner.getItemAtPosition(i).toString())){
                    imageView.setImageResource(R.drawable.leonardo);
                    Toast.makeText(adapterView.getContext(),"You Choose "+str[3],Toast.LENGTH_LONG).show();
                    Toast.makeText(adapterView.getContext(),"Abbreviated as (Leo), he is a fictional character, a ninja warrior from the family of the Teenage Mutant Ninja Turtles.",Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}
