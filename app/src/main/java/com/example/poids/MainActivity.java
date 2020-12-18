package com.example.poids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bCalculer;
    private EditText taille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCalculer = (Button) this.findViewById(R.id.boutonCalculer);


        bCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText tailLeView = (EditText) findViewById(R.id.taille);
                String taille = tailLeView.getText().toString();
                Float poidsIdeal = (3 * Float.parseFloat(taille) - 250) / 4;
                Context context = getApplicationContext();
                CharSequence text = "votre poids idéal est" + poidsIdeal + "kg";
                int duration = (Toast.LENGTH_SHORT);
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER,0 , 0 );
                toast.show();
            }
        });



    }
}