package com.example.ersinkalafat.vucutkitleindexi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btHesapla;
    EditText edtBoy, edtKilo;
    TextView tvVkiSonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btHesapla = (Button)findViewById(R.id.IDbtHesapla);
        edtBoy = (EditText) findViewById(R.id.IDedtBoy);
        edtKilo = (EditText) findViewById(R.id.IDedtKilo);
        tvVkiSonuc = (TextView) findViewById(R.id.IDtvVkiSonuc);

        btHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kilo = Integer.valueOf (edtKilo.getText().toString());
                Double boy = Double.valueOf(edtBoy.getText().toString());
                if (kilo==0 || boy==0) {
                    Toast.makeText(MainActivity.this, "Girilen Boy veya Kilo Geçersiz!", Toast.LENGTH_LONG).show();
                }
                tvVkiSonuc.setText(String.valueOf(String.format("%10.2f",kilo/(boy*boy))));
            }
        });


    }
}
