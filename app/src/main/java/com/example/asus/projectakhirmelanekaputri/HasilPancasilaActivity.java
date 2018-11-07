package com.example.asus.projectakhirmelanekaputri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HasilPancasilaActivity extends Activity {
TextView txtHasilPanca;
    Button btnHome, btnList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_pancasila);
        txtHasilPanca=(TextView)findViewById(R.id.txtHasilPanca);
        Intent intent = getIntent();
        String prosesData=(String)intent.getSerializableExtra("hasilpanca");
        txtHasilPanca.setText(prosesData);
        // membuat intent ketika button di klik
        btnHome =(Button)findViewById(R.id.btnHomePanca);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilPancasilaActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnList = (Button)findViewById(R.id.btnListPanca);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilPancasilaActivity.this,ListMatakuliahActivity.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hasil_pancasila, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
