package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        loadBanner();

        int k = 1;
        TextView don;
        don = findViewById(R.id.don);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, donate.class);
                startActivity(i);
            }
        });

        ConstraintLayout c1,c2;
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.INVISIBLE);

        ImageButton q1,q2,q3,q4,q5,q6,q7,q8,q9;
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        q5 = findViewById(R.id.q5);
        q6 = findViewById(R.id.q6);
        q7 = findViewById(R.id.q7);
        q8 = findViewById(R.id.q8);
        q9 = findViewById(R.id.q9);
        ImageView aa1,aa2,aa3,aa4,aa5,aa6,aa7,aa8,aa9;
aa1 =    findViewById(R.id.aa1);
aa2 =    findViewById(R.id.aa2);
aa3 =    findViewById(R.id.aa3);
aa4 =    findViewById(R.id.aa4);
aa5 =    findViewById(R.id.aa5);
aa6 =    findViewById(R.id.aa6);
aa7 =    findViewById(R.id.aa7);
aa8 =    findViewById(R.id.aa8);
aa9 =    findViewById(R.id.aa9);
        Button b1  = findViewById(R.id.button);

        aa1.setVisibility(View.INVISIBLE);
        aa2.setVisibility(View.INVISIBLE);
        aa3.setVisibility(View.INVISIBLE);
        aa4.setVisibility(View.INVISIBLE);
        aa5.setVisibility(View.INVISIBLE);
        aa6.setVisibility(View.INVISIBLE);
        aa7.setVisibility(View.INVISIBLE);
        aa8.setVisibility(View.INVISIBLE);
        aa9.setVisibility(View.INVISIBLE);
        ImageView bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9;
bb1 =    findViewById(R.id.bb1);
bb2 =    findViewById(R.id.bb2);
bb3 =    findViewById(R.id.bb3);
bb4 =    findViewById(R.id.bb4);
bb5 =    findViewById(R.id.bb5);
bb6 =    findViewById(R.id.bb6);
bb7 =    findViewById(R.id.bb7);
bb8 =    findViewById(R.id.bb8);
bb9 =    findViewById(R.id.bb9);


        bb1.setVisibility(View.INVISIBLE);
        bb2.setVisibility(View.INVISIBLE);
        bb3.setVisibility(View.INVISIBLE);
        bb4.setVisibility(View.INVISIBLE);
        bb5.setVisibility(View.INVISIBLE);
        bb6.setVisibility(View.INVISIBLE);
        bb7.setVisibility(View.INVISIBLE);
        bb8.setVisibility(View.INVISIBLE);
        bb9.setVisibility(View.INVISIBLE);
int [] array = new int [9];
        TextView tf ;
        tf = findViewById(R.id.tf);
        tf.setVisibility(View.INVISIBLE);
        int [] w = new int[9];
        TextView p1,p2;
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
int [] v =new int[9];

    q1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            if(v[0] == 0){
v[0] = 1;
                int che1 = 0;
                for(int i = 0; i < array.length; i++) {
                    if(array[i] == 0){
                        che1++;//9
                    }
                }
                if(che1 %2 != 0){//odd
                    aa1.setVisibility(View.VISIBLE);
                    w[0] = 8;//zero
                }
                else{//even
                    bb1.setVisibility(View.VISIBLE);
                    w[0] = 9;//one
                }
                array[0] = 1;        if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
                        || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
                        || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
                        || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
                    tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                    c2.setVisibility(View.VISIBLE);
                    p1.setVisibility(View.VISIBLE);
                    p2.setVisibility(View.INVISIBLE);

                }
                if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
                        || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
                        || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
                        || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
                    tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                    c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
                    p2.setVisibility(View.VISIBLE);
                }

            }

        }
    });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
if(v[1] == 0){
v[1] = 1;
    int che1 = 0;
    for(int i = 0; i < array.length; i++) {
        if(array[i] == 0){
            che1++;//9
        }
    }
    if(che1 %2 != 0){//odd
        aa2.setVisibility(View.VISIBLE);                    w[1] = 8;//zero

    }
    else{//even
        bb2.setVisibility(View.VISIBLE);                    w[1] = 9;//one

    }
    array[1] = 1;
    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
        p2.setVisibility(View.INVISIBLE);
    }
    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
        p2.setVisibility(View.VISIBLE);
    }

}


                }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
if(v[2] == 0){
    v[2] = 1;
    int che1 = 0;
    for(int i = 0; i < array.length; i++) {
        if(array[i] == 0){
            che1++;//9
        }
    }
    if(che1 %2 != 0){//odd
        aa3.setVisibility(View.VISIBLE);                    w[2] = 8;//zero

    }
    else{//even
        bb3.setVisibility(View.VISIBLE);                    w[2] = 9;//one

    }
    array[2] = 1;
    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
        p2.setVisibility(View.INVISIBLE);
    }
    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
        p2.setVisibility(View.VISIBLE);
    }
}

                }
        });
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(v[3] == 0){
v[3] = 1;
                    int che1 = 0;
                    for(int i = 0; i < array.length; i++) {
                        if(array[i] == 0){
                            che1++;//9
                        }
                    }
                    if(che1 %2 != 0){//odd
                        aa4.setVisibility(View.VISIBLE);                    w[3] = 8;//zero

                    }
                    else{//even
                        bb4.setVisibility(View.VISIBLE);                    w[3] = 9;//one

                    }
                    array[3] = 1;
                    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
                            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
                        p2.setVisibility(View.INVISIBLE);
                    }
                    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
                            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
                        p2.setVisibility(View.VISIBLE);
                    }
                }

                }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(v[4] == 0){
v[4] = 1;
                    int che1 = 0;
                    for(int i = 0; i < array.length; i++) {
                        if(array[i] == 0){
                            che1++;//9
                        }
                    }
                    if(che1 %2 != 0){//odd
                        aa5.setVisibility(View.VISIBLE);                    w[4] = 8;//zero

                    }
                    else{//even
                        bb5.setVisibility(View.VISIBLE);                    w[4] = 9;//one

                    }
                    array[4] = 1;

                    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
                            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
                        p2.setVisibility(View.INVISIBLE);
                    }
                    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
                            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
                        p2.setVisibility(View.VISIBLE);
                    }
                }

                }
        });
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(v[5] == 0){
v[5] = 1;
                    int che1 = 0;
                    for(int i = 0; i < array.length; i++) {
                        if(array[i] == 0){
                            che1++;//9
                        }
                    }
                    if(che1 %2 != 0){//odd
                        aa6.setVisibility(View.VISIBLE);                    w[5] = 8;//zero

                    }
                    else{//even
                        bb6.setVisibility(View.VISIBLE);                    w[5] = 9;//one

                    }
                    array[5] = 1;
                    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
                            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
                        p2.setVisibility(View.INVISIBLE);
                    }
                    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
                            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
                        p2.setVisibility(View.VISIBLE);
                    }
                }

                }
        });
        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(v[6] == 0){
v[6] =1 ;
                    int che1 = 0;
                    for(int i = 0; i < array.length; i++) {
                        if(array[i] == 0){
                            che1++;//9
                        }
                    }
                    if(che1 %2 != 0){//odd
                        aa7.setVisibility(View.VISIBLE);                    w[6] = 8;//zero

                    }
                    else{//even
                        bb7.setVisibility(View.VISIBLE);                    w[6] = 9;//one

                    }
                    array[6] = 1;
                    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
                            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
                        p2.setVisibility(View.INVISIBLE);
                    }
                    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
                            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
                        p2.setVisibility(View.VISIBLE);
                    }
                }


            }
        });
        q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(v[7] == 0){
v[7] = 1;
                    int che1 = 0;
                    for(int i = 0; i < array.length; i++) {
                        if(array[i] == 0){
                            che1++;//9
                        }
                    }
                    if(che1 %2 != 0){//odd
                        aa8.setVisibility(View.VISIBLE);                    w[7] = 8;//zero

                    }
                    else{//even
                        bb8.setVisibility(View.VISIBLE);                    w[7] = 9;//one

                    }
                    array[7] = 1;
                    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
                            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
                        p2.setVisibility(View.INVISIBLE);
                    }
                    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
                            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
                        p2.setVisibility(View.VISIBLE);
                    }
                }



                }
        });
        q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(v[8] == 0){
v[8] = 1;
                    int che1 = 0;
                    for(int i = 0; i < array.length; i++) {
                        if(array[i] == 0){
                            che1++;//9
                        }
                    }
                    if(che1 %2 != 0){//odd
                        aa9.setVisibility(View.VISIBLE);                    w[8] = 8;//zero

                    }
                    else{//even
                        bb9.setVisibility(View.VISIBLE);                    w[8] = 9;//one

                    }
                    array[8] = 1;
                    if( ( w[0] == 8 && w[1] == 8 && w[2] ==  8) || (w[0] == 8 && w[3] == 8 && w[6] ==  8) || (w[6] == 8 && w[7] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[5] == 8 && w[8] ==  8) || (w[3] == 8 && w[4] == 8 && w[5] ==  8)
                            || (w[1] == 8 && w[4] == 8 && w[7] ==  8) || (w[0] == 8 && w[4] == 8 && w[8] ==  8)
                            || (w[2] == 8 && w[4] == 8 && w[6] ==  8)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);p1.setVisibility(View.VISIBLE);
                        p2.setVisibility(View.INVISIBLE);
                    }
                    if( ( w[0] == 9 && w[1] == 9 && w[2] ==  9) || (w[0] == 9 && w[3] == 9 && w[6] ==  9) || (w[6] == 9 && w[7] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[5] == 9 && w[8] ==  9) || (w[3] == 9 && w[4] == 9 && w[5] ==  9)
                            || (w[1] == 9 && w[4] == 9 && w[7] ==  9) || (w[0] == 9 && w[4] == 9 && w[8] ==  9)
                            || (w[2] == 9 && w[4] == 9 && w[6] ==  9)){
                        tf.setVisibility(View.VISIBLE);c1.setVisibility(View.INVISIBLE);
                        c2.setVisibility(View.VISIBLE);  p1.setVisibility(View.INVISIBLE);
                        p2.setVisibility(View.VISIBLE);
                    }
                }

                }
        });


b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        aa1.setVisibility(View.INVISIBLE);
        aa2.setVisibility(View.INVISIBLE);
        aa3.setVisibility(View.INVISIBLE);
        aa4.setVisibility(View.INVISIBLE);
        aa5.setVisibility(View.INVISIBLE);
        aa6.setVisibility(View.INVISIBLE);
        aa7.setVisibility(View.INVISIBLE);
        aa8.setVisibility(View.INVISIBLE);
        aa9.setVisibility(View.INVISIBLE);

        bb1.setVisibility(View.INVISIBLE);
        bb2.setVisibility(View.INVISIBLE);
        bb3.setVisibility(View.INVISIBLE);
        bb4.setVisibility(View.INVISIBLE);
        bb5.setVisibility(View.INVISIBLE);
        bb6.setVisibility(View.INVISIBLE);
        bb7.setVisibility(View.INVISIBLE);
        bb8.setVisibility(View.INVISIBLE);
        bb9.setVisibility(View.INVISIBLE);
        tf.setVisibility(View.INVISIBLE);
        for (int i = 0; i < array.length ; i++) {
            array[i] = 0;
        }
        for (int i = 0; i < w.length; i++) {
            w[i] = 0;
        }
        for (int i = 0; i < w.length; i++) {
            v[i] = 0;
        }
    }
});

Button res = findViewById(R.id.restart);
res.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        c1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.INVISIBLE);
        aa1.setVisibility(View.INVISIBLE);
        aa2.setVisibility(View.INVISIBLE);
        aa3.setVisibility(View.INVISIBLE);
        aa4.setVisibility(View.INVISIBLE);
        aa5.setVisibility(View.INVISIBLE);
        aa6.setVisibility(View.INVISIBLE);
        aa7.setVisibility(View.INVISIBLE);
        aa8.setVisibility(View.INVISIBLE);
        aa9.setVisibility(View.INVISIBLE);
        bb1.setVisibility(View.INVISIBLE);
        bb2.setVisibility(View.INVISIBLE);
        bb3.setVisibility(View.INVISIBLE);
        bb4.setVisibility(View.INVISIBLE);
        bb5.setVisibility(View.INVISIBLE);
        bb6.setVisibility(View.INVISIBLE);
        bb7.setVisibility(View.INVISIBLE);
        bb8.setVisibility(View.INVISIBLE);
        bb9.setVisibility(View.INVISIBLE);
        tf.setVisibility(View.INVISIBLE);
        for (int i = 0; i < array.length ; i++) {
            array[i] = 0;
        }
        for (int i = 0; i < w.length; i++) {
            w[i] = 0;
        } for (int i = 0; i < w.length; i++) {
            v[i] = 0;
        }


    }
});

    }
    void loadBanner(){
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}