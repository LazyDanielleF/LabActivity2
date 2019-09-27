package com.iics1154ita.gazo.daniellefrancisco.labactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    private void getPref(){
        pref = getSharedPreferences("MyPref", MODE_PRIVATE);
        editor = pref.edit();
    }

    public void verify(View view){
        getPref();
        boolean veri = false;
        for (int i = 1; i <= 8; i++){
            if(((TextView)findViewById(R.id.editText)).getText().toString().equals(pref.getString("t"+i, null))){
                Log.d("test", "" + i);
                Toast.makeText(this,"School is competing in UAAP", Toast.LENGTH_LONG).show();
                veri = true;
            }
        }
        if (veri == true){
        } else {
            Toast.makeText(this,"School is not part of UAAP", Toast.LENGTH_LONG).show();
        }
    }
}
