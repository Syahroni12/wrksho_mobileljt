package com.example.wsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
private EditText txt_username,txt_password;
Button btn_login,btn_register;
private String ref_username="Syahroni";
private String ref_password="123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

txt_username=findViewById(R.id.txt_username);
txt_password=findViewById(R.id.txt_passsword);
btn_login=findViewById(R.id.btn_login);
btn_register=findViewById(R.id.link_register);

btn_login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
if(txt_username.getText().toString().equalsIgnoreCase(ref_username)&&txt_password.getText().toString().equalsIgnoreCase(ref_password)){
    Intent pindah=new Intent(login.this,MainActivity.class);
startActivity(pindah);

    Toast.makeText(login.this,"Login berhasil",Toast.LENGTH_SHORT).show();
}else {

    Toast.makeText(login.this,"username atau password salah",Toast.LENGTH_SHORT).show();
}
    }
});
btn_register.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent hlm_register=new Intent(login.this, registrasi.class);
        startActivity(hlm_register );
    }
});
    }
}