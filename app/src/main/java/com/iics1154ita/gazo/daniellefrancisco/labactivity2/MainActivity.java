package com.iics1154ita.gazo.daniellefrancisco.labactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ((TextView)findViewById(R.id.t1)).setText("UST");
//        ((TextView)findViewById(R.id.t2)).setText("UP");
//        ((TextView)findViewById(R.id.t3)).setText("NU");
//        ((TextView)findViewById(R.id.t4)).setText("DLSU");
//        ((TextView)findViewById(R.id.t5)).setText("ADMU");
//        ((TextView)findViewById(R.id.t6)).setText("UE");
//        ((TextView)findViewById(R.id.t7)).setText("FEU");
//        ((TextView)findViewById(R.id.t8)).setText("ADU");


    }

    private void getPref(){
        pref = getSharedPreferences("MyPref", MODE_PRIVATE);
        editor = pref.edit();
    }

    public void Save(View view){
        getPref();
        editor.putString("t1", ((TextView)findViewById(R.id.t1)).getText().toString());
        editor.putString("t2", ((TextView)findViewById(R.id.t2)).getText().toString());
        editor.putString("t3", ((TextView)findViewById(R.id.t3)).getText().toString());
        editor.putString("t4", ((TextView)findViewById(R.id.t4)).getText().toString());
        editor.putString("t5", ((TextView)findViewById(R.id.t5)).getText().toString());
        editor.putString("t6", ((TextView)findViewById(R.id.t6)).getText().toString());
        editor.putString("t7", ((TextView)findViewById(R.id.t7)).getText().toString());
        editor.putString("t8", ((TextView)findViewById(R.id.t8)).getText().toString());
        editor.commit();
        Toast.makeText(this,"saved", Toast.LENGTH_LONG).show();
    }

    public void Next(View view){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
