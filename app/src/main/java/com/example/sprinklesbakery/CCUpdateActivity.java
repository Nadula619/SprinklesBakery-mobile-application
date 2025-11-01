package com.example.sprinklesbakery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


public class CCUpdateActivity extends AppCompatActivity {

EditText UPname,UPcat,UPprice,UPccurl;
Button UPbtn;

DatabaseReference DBreference ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccupdate);
        UPname= findViewById(R.id.upName);
        UPcat= findViewById(R.id.upCat);
        UPprice=findViewById(R.id.upPrice);
        UPccurl=findViewById(R.id.upCcurl);
        UPbtn=findViewById(R.id.btnUPData);

        UPbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= UPname.getText().toString();
                String category=UPcat.getText().toString();
                String price=UPprice.getText().toString();
                String ccurl=UPccurl.getText().toString();

                CCUpdate(name,category,price,ccurl);
            }
        });




    }
    public void CCUpdate(String name,String category,String price, String ccurl ){
        HashMap CupCakes= new HashMap();
        CupCakes.put("name", name);
        CupCakes.put("categories", category);
        CupCakes.put("price", price);
        CupCakes.put("ccurl", ccurl);
        DBreference= FirebaseDatabase.getInstance().getReference("CupCakes");
        DBreference.child(name).updateChildren(CupCakes).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(@NonNull Task task) {
                if (task.isSuccessful()) {
                    UPname.setText("");
                    UPcat.setText("");
                    UPprice.setText("");
                    UPccurl.setText("");
                    Toast.makeText(CCUpdateActivity.this, "Successfully Update", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(CCUpdateActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}