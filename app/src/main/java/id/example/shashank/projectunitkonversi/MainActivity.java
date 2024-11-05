package id.example.shashank.projectunitkonversi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.example.shashank.projectunitkonversi.ui.DetailMasaActivity;

public class MainActivity extends AppCompatActivity {
CardView CdTemp;
CardView CdMasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CdTemp = findViewById(R.id.CdTemp);
        CdTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DetailSuhuActivity.class));
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CdMasa = findViewById(R.id.CdMasa);
        CdMasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DetailMasaActivity.class));
            }
        });

    }
}