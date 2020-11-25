package com.example.android.depressiontest;

import android.content.Intent;
import android.speech.tts.Voice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //TextView Introduksi;
    Button VoiceTest;
    Button StartTest;
    Button TestInfo;
    Button EmotionTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Introduksi = (TextView)findViewById(R.id.AIDText);
        //Introduksi.setText("Gunakan aplikasi ini untuk menguji kemungkinan kamu mengalami depresi dan menilai tingkat keparahan depresimu." +
               // "Tes ini hanyalah alat uji coba sementara.");


        VoiceTest = (Button)findViewById(R.id.btnVoice);
        VoiceTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent v=new Intent(getApplicationContext(), VoiceActivity.class);


                startActivity(v);
            }
        });

        StartTest = (Button)findViewById(R.id.MulaiTest);
        StartTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), StartActivity.class);


                startActivity(i);
            }
        });

        TestInfo = (Button)findViewById(R.id.InfoTes);
        TestInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m=new Intent(getApplicationContext(), ReccomendActivity.class);

                startActivity(m);
            }
        });

        EmotionTest = (Button)findViewById(R.id.btnEmo);
        EmotionTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e=new Intent(getApplicationContext(), EmotionActivity.class);


                startActivity(e);
            }
        });

    }
}
