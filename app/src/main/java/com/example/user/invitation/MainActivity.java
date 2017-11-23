package com.example.user.invitation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView masuk;
    ImageView keluar;
    ImageView back;
    ImageView backk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masuk=findViewById(R.id.masuk);
        keluar=findViewById(R.id.keluar);
    }

    public void AmNo(View view) {
        keluar.setVisibility(View.VISIBLE);
    }

    public void ImIn(View view) {
        masuk.setVisibility(View.VISIBLE);
    }

    public void back(View view) {
        keluar.setVisibility(View.INVISIBLE);
    }

    public void backk (View view) {
        masuk.setVisibility(View.INVISIBLE);
    }
}
