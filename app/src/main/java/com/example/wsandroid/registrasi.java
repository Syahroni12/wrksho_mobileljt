package com.example.wsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class registrasi extends AppCompatActivity {
EditText txttanggal;
DatePickerDialog datePickerDialog;
SimpleDateFormat dateFormatt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        txttanggal=findViewById(R.id.txttanggal);
        dateFormatt=new SimpleDateFormat("dd-MM-yyyy");
        txttanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatedialog();
            }


        });


    }

    private void showDatedialog() {
        Calendar calendar=Calendar.getInstance();
        datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayOFMonth) {
                Calendar newDate=Calendar.getInstance();
                newDate.set(year,month,dayOFMonth);
                txttanggal.setText(dateFormatt.format(newDate.getTime()));
            }
        },calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();

    }


}