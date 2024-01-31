package com.pscode.pslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.os.*;
import android.view.*;
import android.widget.*;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    //    Capturing the English Book Details
    protected Toast ts;
    protected Intent in;

    FirebaseAuth auth;
    FirebaseFirestore firestore;

    public void bookEngOne(View view) {
        ts = Toast.makeText(this, " Dear Stranger. Fetching From Database.", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookEngOne.class);
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        ts.show();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        }, 900);
    }

    public void bookEngTwo(View view){
        ts = Toast.makeText(this, " Rich Dad, Poor Dad. Fetching From Database", Toast.LENGTH_SHORT);
//       creating the Intent
        in = new Intent(this, bookEngTwo.class);
//    Creating the delay in Accessing
        Handler handle = new Handler();
        ts.show();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }
    public void bookEngThree(View view){
        ts = Toast.makeText(this, " How To Win Every Argument. Fetching From Database", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookEngThree.class);
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        ts.show();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }
    public void bookEngFour(View view){
        ts = Toast.makeText(this, "Think And Grow Rich. Fetching From Database", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookEngFour.class);
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        ts.show();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);

    }
    public void bookEngFive(View view){
        ts = Toast.makeText(this, "Five Love Language. Fetching From Database", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookEngFive.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);

    }

    public void bookEngSix(View view){
        ts = Toast.makeText(this, "What I Love Love About You And Our Memories. Fetching From Database", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookEngSix.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    //    Capturing the Marathi Book Details
    public void bookMarOne(View view){
        ts = Toast.makeText(this, "श्री गणेश स्तोत्र ", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookMarOne.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    public void bookMarTwo(View view){
        ts = Toast.makeText(this, "श्री गणपती अथर्वशीर्षक", Toast.LENGTH_SHORT);
        //       creating the Intent

        in = new Intent(this, bookMarTwo.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }
    public void bookMarThree(View view){
        ts = Toast.makeText(this, "श्री कृष्ण चरित्र ", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookMarThree.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    public void bookMarFour(View view){
        ts = Toast.makeText(this, "श्रीमद भगवद गीत ", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookMarFour.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    //    Capturing the Computer Book Details
    public void bookComOne(View view){
        ts = Toast.makeText(this, "C Programming", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookComOne.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    public void bookComTwo(View view){
        ts = Toast.makeText(this, "Cpp Programming", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookComTwo.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    public void bookComThree(View view){
        ts = Toast.makeText(this, "Java Programming", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookComThree.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    public void bookComFour(View view){
        ts = Toast.makeText(this, "Data Structure With Java", Toast.LENGTH_SHORT);
        //       creating the Intent
        in = new Intent(this, bookComFour.class);
        ts.show();
        //    Creating the delay in Accessing
        Handler handle = new Handler();
        handle.postDelayed(() -> {
            startActivity(in);
            ts.cancel();
        },900);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
    }
}