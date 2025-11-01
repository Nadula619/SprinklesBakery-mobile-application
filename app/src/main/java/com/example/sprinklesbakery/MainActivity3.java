package com.example.sprinklesbakery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity3 extends AppCompatActivity {

    EditText Name;
    EditText etCat;
    EditText etPrice;
    EditText etCcurl;
    Button btnInsertData;

    DatabaseReference Cupcakedb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Name= findViewById(R.id.etName);
        etCat=findViewById(R.id.etCat);
        etPrice=findViewById(R.id.etPrice);
        etCcurl=findViewById(R.id.etCcurl);
        btnInsertData=findViewById(R.id.btnInsertData);

        Cupcakedb= FirebaseDatabase.getInstance().getReference().child("CupCakes");

        btnInsertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertCupcakeData();
            }
        });
    }private  void insertCupcakeData(){
        String name=Name.getText().toString();
        String Category = etCat.getText().toString();
        String Price = etPrice.getText().toString();
        String CCurl = etCcurl.getText().toString();

        Cupcakes cupcakes= new Cupcakes(name,Category,Price,CCurl);
        Cupcakedb.push().setValue(cupcakes);
        Toast.makeText(this, "Cupcake Added!", Toast.LENGTH_SHORT).show();
    }
}