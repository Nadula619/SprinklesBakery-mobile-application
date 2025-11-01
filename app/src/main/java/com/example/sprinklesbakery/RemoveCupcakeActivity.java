
package com.example.sprinklesbakery;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class RemoveCupcakeActivity extends AppCompatActivity {

    private EditText editTextCupcakeName;
    private Button buttonRemoveCupcake;

    private DatabaseReference cupcakeRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_cupcake);

        editTextCupcakeName = findViewById(R.id.editTextCupcakeName);
        buttonRemoveCupcake = findViewById(R.id.buttonRemoveCupcake);

        cupcakeRef = FirebaseDatabase.getInstance().getReference().child("CupCakes");

        buttonRemoveCupcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeCupcake();
            }
        });
    }

    private void removeCupcake() {
        String cupcakeName = editTextCupcakeName.getText().toString().trim();

        if (!cupcakeName.isEmpty()) {
            Query query = cupcakeRef.orderByChild("name").equalTo(cupcakeName);
            query.addListenerForSingleValueEvent(new com.google.firebase.database.ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            snapshot.getRef().removeValue();
                        }
                        Toast.makeText(RemoveCupcakeActivity.this, "Cupcake removed successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(RemoveCupcakeActivity.this, "Cupcake not found", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Toast.makeText(RemoveCupcakeActivity.this, "Error: " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            Toast.makeText(this, "Please enter cupcake name", Toast.LENGTH_SHORT).show();
        }
    }
}
