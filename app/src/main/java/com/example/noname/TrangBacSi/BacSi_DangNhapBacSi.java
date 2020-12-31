package com.example.noname.TrangBacSi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.noname.ChonNguoiDung;
import com.example.noname.R;

public class BacSi_DangNhapBacSi extends AppCompatActivity {

    Button btnDangNhap;
    ImageButton imgBack_DangNhapBacSi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap_tk_bac_si);

        btnDangNhap=findViewById(R.id.btnDangNhap_BacSi);
        imgBack_DangNhapBacSi=findViewById(R.id.imgBack_DangNhapBacSi);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BacSi_DangNhapBacSi.this, Nav_TrangBacSi.class));
            }
        });

        imgBack_DangNhapBacSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BacSi_DangNhapBacSi.this, ChonNguoiDung.class));
            }
        });
    }
}