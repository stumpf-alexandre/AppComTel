package com.example.als.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTel = findViewById(R.id.txtFone);

        txtTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(Intent.ACTION_DIAL);
                intencao.setData(Uri.parse("tel: "+txtTel.getText().toString()));
                if (intencao.resolveActivity(getPackageManager()) != null){
                    startActivity(intencao);
                }
            }
        });
    }
}
