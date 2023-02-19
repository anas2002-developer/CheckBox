package com.anas.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    Button btnDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox=findViewById(R.id.checkBox);
        btnDone=findViewById(R.id.btnDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox.isChecked()){
                    Toast.makeText(MainActivity.this, checkBox.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "CheckBox unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}