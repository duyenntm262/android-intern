package edu.hanu.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import edu.hanu.app.facebook.FacebookActivity;
import edu.hanu.app.instagram.InstagramActivity;
import edu.hanu.app.pinterest.PinterestActivity;
import edu.hanu.app.tiktok.TiktokActivity;

public class MainActivity extends AppCompatActivity {
    ImageView pinterest, facebook, instagram, tiktok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pinterest = findViewById(R.id.imgPinterest);
        facebook = findViewById(R.id.imgFacebook);
        instagram = findViewById(R.id.imgInstagram);
        tiktok = findViewById(R.id.imgTiktok);

        pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PinterestActivity.class);
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FacebookActivity.class);
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InstagramActivity.class);
                startActivity(intent);
            }
        });

        tiktok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TiktokActivity.class);
                 startActivity(intent);
            }
        });
    }
}