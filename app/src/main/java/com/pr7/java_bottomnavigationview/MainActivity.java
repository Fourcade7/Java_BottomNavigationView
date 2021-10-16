package com.pr7.java_bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomnavigationview);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.item1:
                        item.setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.linearlay,new BlankFragment()).commit();break;
                    case R.id.item2:
                        item.setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.linearlay,new BlankFragment2()).commit();break;
                    case R.id.item3:
                        item.setChecked(true);
                        getSupportFragmentManager().beginTransaction().replace(R.id.linearlay,new BlankFragment3()).commit();break;
                }

                return false;
            }
        });
    }
}