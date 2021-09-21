package com.example.androidrealm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Realm realm;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realm=Realm.getDefaultInstance();
        Button create = findViewById(R.id.create);
        Button update = findViewById(R.id.update);
        Button delete = findViewById(R.id.delete);
        Button read = findViewById(R.id.read);
         text = findViewById(R.id.data);

        create.setOnClickListener(this);
        update.setOnClickListener(this);
        delete.setOnClickListener(this);
        read.setOnClickListener(this);
    }
    //hemlo//

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.create){
            Log.d("Create","Create");
        } if(v.getId() == R.id.read){
            Log.d("Read","Read");
        } if(v.getId() == R.id.update){
            Log.d("Update","Update");
        } if(v.getId() == R.id.delete){
            Log.d("Delete","Delete");
        }
    }
    private void create(){
        final AlertDialog.Builder al = new AlertDialog.Builder(MainActivity.this);
        View view = getLayoutInflater().inflate(R.layout.form,null);
        al.setView(view);
        final EditText name=view.findViewById(R.id.nama);
        final EditText age=view.findViewById(R.id.age);
        final Spinner gender=view.findViewById(R.id.gender);
        Button save=view.findViewById(R.id.save);
        final AlertDialog alertDialog=al.show();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}