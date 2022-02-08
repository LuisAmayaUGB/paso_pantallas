package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


  ir=(Button) findViewById(R.id.btnir2);



  ir.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

          Intent pantalla2=new Intent(getApplicationContext(), MainActivity2.class);
          startActivity(pantalla2);

      }
  });




    }
}