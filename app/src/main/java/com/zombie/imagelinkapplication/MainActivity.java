package com.zombie.imagelinkapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.my_button);
        button.setOnClickListener(view -> {
            try {
                String url = "https://getmyuni.azureedge.net/college-image/big/suresh-gyan-vihar-university-sgvu-jaipur.jpg";
                Uri uri = Uri.parse(url);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(MainActivity.this,"Cannot See the Image", Toast.LENGTH_SHORT).show();
            }
        });
    }
}