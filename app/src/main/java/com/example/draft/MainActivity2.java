package com.example.draft;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.core.OnlineState;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity2   extends AppCompatActivity {
    private static final String Tag = "MainActivity2";

    private BluetoothManager mBluetoothManager;
    private BluetoothAdapter mBluetoothAdaptor;

    private Toolbar mainToolbar;

    private FirebaseFirestore db;
    private FirebaseAuth mAuth;
    private Button GPS1btn;
    private Button GPS2btn;
    private EditText OnlineStatus;



    //in your OnCreate() method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mAuth = FirebaseAuth.getInstance();
        mBluetoothAdaptor = BluetoothAdapter.getDefaultAdapter();

        mainToolbar = (Toolbar) findViewById(R.id.ThirdToolbar);
        setSupportActionBar(mainToolbar);

        getSupportActionBar().setTitle("Main Page 2");

        TextView User1 = (TextView) findViewById(R.id.User1);
        TextView User2 = (TextView) findViewById(R.id.User2);
        TextView Heart1 = (TextView) findViewById(R.id.Heart1);
        TextView Heart2 = (TextView) findViewById(R.id.Heart2);
        TextView Ox1 = (TextView) findViewById(R.id.Ox1);
        TextView Ox2 = (TextView) findViewById(R.id.Ox2);
        OnlineStatus = (EditText) findViewById(R.id.reg_email);
        Button GPS1 = (Button) findViewById(R.id.GPS1);
        Button GPS2 = (Button) findViewById(R.id.GPS2);

//        USer1.setText("My Awesome Text");
//        GPS1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//
//                //Redirect
//
//                String OnlineState = OnlineState.getText().toString();
//
//                if (!TextUtils.isEmpty(loginEmail) && !TextUtils.isEmpty(loginPass)) {
//                    mAuth.signInWithEmailAndPassword(loginEmail, loginPass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if(task.isSuccessful()){
//                                sendToMain();
//                            }
//                            else{
//                                String errorMessage= task.getException().getMessage();
//                                Toast.makeText(LoginActivity.this, "Error: " + errorMessage, Toast.LENGTH_LONG).show();
//                            }
//                            loginProgress.setVisibility(View.INVISIBLE);
//
//                        }
//                    });
//
//
//
//                }
//            }
//
//        });
    }

//    public makeUserOnline(){
//        var query = FirebaseFirestore.getInstance().collection("UserID").document(user.userId ?: "");
//        user.apply{
//            online = true;
//            last_active = 0;
//
//        }
//        query.set(user);
//        //Firebase Status
//        var fbquery = FirebaseDatabase.getInstance().getReference("UserID/" + user.userId).setValue("online")
//
//        //Disconnect
//        FirebaseDatabase.getInstance().getReference("/status/" + user.userId)
//                .onDisconnect()     // Set up the disconnect hook
//                .setValue("offline");
//
//    }
//
//    public makeUserOffline()
//    {
//
//        // Firestore
//        var query = FirebaseFirestore.getInstance().collection("users").document(user.userId ?: "")
//        user.apply {
//        //    online = false
//        last_active = System.currentTimeMillis()
//    }
//        query.set(user)
//
//        // Firebase
//        var fbquery = FirebaseDatabase.getInstance().getReference("status/" + user.userId).setValue("offline")
//    }
//
//    query.addValueEventListener(new ValueEventListener() {
//        @Override
//        public void onDataChange(DataSnapshot dataSnapshot) {
//            if (dataSnapshot.hasChildren()) {
//                for (DataSnapshot child : dataSnapshot.getChildren()) {
//                    emailcon.setText("email "+searchEmail+" found at URL "+child.getRef());
//                }
//            }
//            else {
//                emailcon.setText("still no email found!!");
//            }
//        }
//        @Override
//        public void onCancelled(FirebaseError firebaseError) {
//        }
//    });

}
