package com.example.android.depressiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView TestResult;
    TextView Disclaimer;
    Button MainMenu;
    int nilaiInt;
    String terimaNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TestResult = (TextView)findViewById(R.id.Hasilnya);
        Disclaimer = (TextView)findViewById(R.id.Keterangan);
        MainMenu = findViewById(R.id.TombolMenu);

        terimaNama = getIntent().getStringExtra("NamaUser");
        nilaiInt = getIntent().getIntExtra("nilai",0);

        if (nilaiInt <= 4){
            TestResult.setText("Hi, " + terimaNama + ", your total score is " + nilaiInt +
                    ". Scores ≤4 suggest minimal depression which may not require treatment.");
        }
        else if (nilaiInt <= 9){
            TestResult.setText("Hi, " + terimaNama + ", your total score is " + nilaiInt +
                    ". Scores 5-9 suggest mild depression which may require only watchful waiting and repeated PHQ-9 at followup. ");
                   // + "Scores 5-9 suggest mild depression which may require only watchful waiting and repeated PHQ-9 at followup.");
        }
        else if (nilaiInt <=14){
            TestResult.setText("Hi, " + terimaNama + ", your total score is " + nilaiInt +
                    ". Scores 10-14 suggest moderate depression severity " +
                    "which may require treatment plan ranging from counseling, followup, and/or pharmacotherapy.");
        }
        else if (nilaiInt <=22){
            TestResult.setText("Hi, " + terimaNama + ", your total score is " + nilaiInt +
                    ". Scores 15-19 suggest moderately severe depression " +
                    " which may require immediate initiation of pharmacotherapy and/or psychotherapy.");
        }
        else if (nilaiInt > 22){
            TestResult.setText("Hi, " + terimaNama + ", your total score is " + nilaiInt +
                    ". Scores 20 and greater suggest severe depression " +
                    ". which may require immediate initiation of pharmacotherapy and expedited referral to mental health specialist.");
        }


        Disclaimer.setText("Jangan menggunakan tes ini untuk membuat diagnosis. Tes ini tidak bisa menggantikan diagnosis profesional."
        + " Bila ragu dengan kondisi mu, silahkan hubungi dokter." + " Lihat tab info di menu utama untuk informasi lebih lanjut tentang depresi.");

        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(f);
            }
        });



    }
}
