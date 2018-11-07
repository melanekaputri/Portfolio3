package com.example.asus.projectakhirmelanekaputri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HasilMikroprosesorActivity extends Activity {
TextView txtHasilMikro;
    Button btnHome,btnList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_mikroprosesor);
        txtHasilMikro =(TextView)findViewById(R.id.txtHasilMikro);
        Intent intent = getIntent();
        String prosesData=(String)intent.getSerializableExtra("hasilmikro");
        txtHasilMikro.setText(prosesData);

        // membuat intent ketika button di klik
        btnHome =(Button)findViewById(R.id.btnHomeMikro);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilMikroprosesorActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnList = (Button)findViewById(R.id.btnListMikro);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HasilMikroprosesorActivity.this,ListMatakuliahActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hasil_mikroprosesor, menu);
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
