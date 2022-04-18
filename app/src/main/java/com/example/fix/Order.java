package com.example.fix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Button order=findViewById(R.id.order);
        Button cancel=findViewById(R.id.cancel);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Order.this,MainActivity.class));
                AlertDialog.Builder alert = new AlertDialog.Builder(Order.this);
                alert.setTitle("Transaksi Success");
                alert.setMessage("Transaksi Berhasil silahkan tunggu Paketmu dirumah");
                alert.setPositiveButton("Mantap", null);
                alert.show();

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Order.this,MainActivity.class));
            }
        });

    }
}