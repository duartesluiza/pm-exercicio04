package com.example.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_to,tv_from,tv_result;
    EditText edt_amount;
    Button btndolar,btnpesos;
    String amount;
    int real,result;





        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Clicklisteners();
    }

    public void init(){
        tv_to=findViewById(R.id.tv_to);
        tv_from=findViewById(R.id.tv_from);
        tv_result=findViewById(R.id.tvresult);
        edt_amount=findViewById(R.id.edt_amount);
        btndolar=findViewById(R.id.btndolar);
        btnpesos=findViewById(R.id.btnpesos);
    }

    public void Clicklisteners() {



        btnpesos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                double real = 7.30;
                double result = Double.parseDouble(amount) / (real);

                tv_result.setText(String.valueOf(result));
                tv_to.setText("PESOS");
                tv_from.setText("Valor em R$: " + result);
            }
        });

        btndolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                double real = 8.21;
                double result = Double.parseDouble(amount) * (real);

                tv_result.setText(String.valueOf(result));
                tv_to.setText("DOLAR");
                tv_from.setText("Valor em R$: " + result);

            }
        });
    }
}
