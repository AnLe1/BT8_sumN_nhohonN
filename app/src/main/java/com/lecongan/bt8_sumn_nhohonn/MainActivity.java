package com.lecongan.bt8_sumn_nhohonn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumber;
    private Button btnTinh;
    private TextView tvKq;
    int[] arr = {0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber = findViewById(R.id.edt_number);
        tvKq = findViewById(R.id.tv_kq);
        btnTinh = findViewById(R.id.btn_Tinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int N = Integer.parseInt(edtNumber.getText().toString());
                int sum = 0;
                String chuoi = "";
                for (int i = 1; i <= N; i++) {
                    sum += i;
                    chuoi += String.valueOf(i);
                    chuoi += (i != N) ? "+" : "";

                    if (sum <= N) {
                        tvKq.setText("S = "+chuoi.substring(0, chuoi.length() - 1)+" \nS= "+sum);
                    }

                }
            }
//                tvKq.setText(chuoi+"\n"+tong);

        });

    }
}
