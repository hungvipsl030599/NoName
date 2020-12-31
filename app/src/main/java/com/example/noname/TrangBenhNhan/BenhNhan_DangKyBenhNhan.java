package com.example.noname.TrangBenhNhan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.noname.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BenhNhan_DangKyBenhNhan extends AppCompatActivity {
    ImageButton imgBack_DangKy;
    Button btnDangKy_DangKy;
    EditText edtNamSinh;

    Calendar calendar=Calendar.getInstance();
    SimpleDateFormat sdfNgay=new SimpleDateFormat("dd/MM/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky_tk_benh_nhan);
        controls();
        events();
    }

    private void events() {
        imgBack_DangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BenhNhan_DangKyBenhNhan.this, BenhNhan_DangNhapBenhNhan.class));
            }
        });
        btnDangKy_DangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BenhNhan_DangKyBenhNhan.this, BenhNhan_DangNhapBenhNhan.class));
            }
        });
        edtNamSinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyHienThiNgay();
            }
        });
    }

    private void xuLyHienThiNgay() {
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);

                edtNamSinh.setText(sdfNgay.format(calendar.getTime()));
            }
        };
        DatePickerDialog datePickerDialog=new DatePickerDialog(BenhNhan_DangKyBenhNhan.this, listener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    private void controls() {
        edtNamSinh=findViewById(R.id.edtNamSinh_BenhNhan_DangKyBenhNhan);
        imgBack_DangKy=findViewById(R.id.imgBack_BenhNhan__DangKyBenhNhan);
        btnDangKy_DangKy=findViewById(R.id.btnDangKy_BenhNhan_DangKyBenhNhan);

    }
}