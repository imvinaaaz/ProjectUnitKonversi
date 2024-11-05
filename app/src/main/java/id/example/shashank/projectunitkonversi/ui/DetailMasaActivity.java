package id.example.shashank.projectunitkonversi.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import id.example.shashank.projectunitkonversi.R;

public class DetailMasaActivity extends AppCompatActivity {
    Spinner spMasa;
    EditText edInputMasa;
    TextView txtHasilMasa;
    Button tbHitung2;
    float hasilConversi2 = 0;
    int posConversi2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masa);

        edInputMasa = findViewById(R.id.edtInputMasa);
        txtHasilMasa = findViewById(R.id.txtHasilMasa);
        spMasa = findViewById(R.id.spMasa);
        tbHitung2 = findViewById(R.id.tbHitung2);

        String[] datamasa = new String[] {"Kg to Pon", "Pon to Kilogram", "Miligram to Kg"};
        spMasa = findViewById(R.id.spMasa);
        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datamasa);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMasa.setAdapter(adapter);
        spMasa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                posConversi2 = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        tbHitung2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetText118n")
            @Override
            public void onClick(View view) {
                if (posConversi2==0){
                    hasilConversi2 = (float) (Integer.parseInt(edInputMasa.getText().toString()));
                }

            }
        });
    }
}