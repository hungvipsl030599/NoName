package com.example.noname.TrangBenhNhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.noname.ChonNguoiDung;
import com.example.noname.R;

public class BenhNhan_DangNhapBenhNhan extends AppCompatActivity {

    Button btnDangNhap, btnDangKy_DangNhap;
    ImageButton imgBack_DangNhapBenhNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap_tk_benh_nhan);
        controls();
        events();
    }

    private void events() {
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BenhNhan_DangNhapBenhNhan.this, Nav_TrangBenhNhan.class));
            }
        });
        btnDangKy_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BenhNhan_DangNhapBenhNhan.this, BenhNhan_DangKyBenhNhan.class));
            }
        });
        imgBack_DangNhapBenhNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BenhNhan_DangNhapBenhNhan.this, ChonNguoiDung.class));
            }
        });
    }

    private void controls() {
        btnDangNhap=findViewById(R.id.btnDangNhap_BenhNhan);
        btnDangKy_DangNhap=findViewById(R.id.btnDangKy_DangNhap_BenhNhan);
        imgBack_DangNhapBenhNhan=findViewById(R.id.imgBack_DangNhapBenhNhan);
    }
}