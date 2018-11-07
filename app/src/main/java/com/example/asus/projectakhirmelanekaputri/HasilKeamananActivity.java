package com.example.asus.projectakhirmelanekaputri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HasilKeamananActivity extends Activity {
TextView txtHasilKeamanan;
    Button btnHome,btnList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_keamanan);
        txtHasilKeamanan=(TextView)findViewById(R.id.txtHasilKeamanan);
        Intent intent = getIntent();
        String prosesData=(String)intent.getSerializableExtra("hasilkeamanan");
        txtHasilKeamanan.setText(prosesData);

        // membuat intent ketika button di klik
        btnHome =(Button)findViewById(R.id.btnHomeKeamanan);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilKeamananActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnList = (Button)findViewById(R.id.btnListKeamanan);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilKeamananActivity.this,ListMatakuliahActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hasil_keamanan, menu);
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
