package com.example.asus.projectakhirmelanekaputri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListMatakuliahActivity extends Activity {
ListView listView;
    String listMatakuliah []={"Mikroprosesor","Pancasila","Pemograman Mobile",
            "Pemograman Client Server","Keamanan Komputer & Jaringan","Sistem Terdistribusi",
            "Administrasi Sistem","Switching & Nirkabel"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_matakuliah);

        listView =(ListView)findViewById(R.id.listMatkul);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listMatakuliah);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(ListMatakuliahActivity.this,MikroprosesorActivity.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(ListMatakuliahActivity.this,PancasilaActivity.class);
                    startActivity(intent);
                }else if (position == 2) {
                    Intent intent = new Intent(ListMatakuliahActivity.this,PemogramanMobileActivity.class);
                    startActivity(intent);
                }else if (position == 3) {
                    Intent intent = new Intent(ListMatakuliahActivity.this,PemogramanClientServerActivity.class);
                    startActivity(intent);
                }else if (position == 4) {
                    Intent intent = new Intent(ListMatakuliahActivity.this,KeamananKomputerJaringanActivity.class);
                    startActivity(intent);
                }else if (position == 5) {
                    Intent intent = new Intent(ListMatakuliahActivity.this,SistemTerdistribusiActivity.class);
                    startActivity(intent);
                }else if (position == 6) {
                    Intent intent = new Intent(ListMatakuliahActivity.this,AdministrasiSistemActivity.class);
                    startActivity(intent);
                }else if (position == 7) {
                    Intent intent = new Intent(ListMatakuliahActivity.this,SwitchingNirkabelActivity.class);
                    startActivity(intent);
                }

                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(ListMatakuliahActivity.this, "Click : " + item,
                        Toast.LENGTH_LONG).show();



            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_matakuliah, menu);
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
