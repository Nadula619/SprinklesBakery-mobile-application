package com.example.sprinklesbakery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Admin extends AppCompatActivity {

    CardView intoRec,intoAdd,intoRem,intoUp,intoMan,intoLout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        intoRec =findViewById(R.id.viewcard);
        intoAdd=findViewById(R.id.addcard);
        intoUp=findViewById(R.id.updatecard);
        intoRem=findViewById(R.id.removecard);
        intoMan=findViewById(R.id.managecard);
        intoLout=findViewById(R.id.logoutcard);

        intoRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Admin.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        intoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Admin.this, MainActivity3.class);
                startActivity(intent);
            }
        });


        intoLout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Admin.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        });

        intoMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Admin.this, OrderManage.class);
                startActivity(intent);
            }
        });

        intoRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Admin.this, RemoveCupcakeActivity.class);
                startActivity(intent);
            }
        });
        intoUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Admin.this, CCUpdateActivity.class);
                startActivity(intent);
            }
        });


    }



}