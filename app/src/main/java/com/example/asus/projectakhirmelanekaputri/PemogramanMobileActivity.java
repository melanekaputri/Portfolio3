package com.example.asus.projectakhirmelanekaputri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class PemogramanMobileActivity extends Activity {
    EditText matakuliah, sks;
    Spinner spinerHari,spinerMasuk, spinerKeluar,spinerDosen;
    String Matakuliah, SKS, Hari,JamMasuk,JamKeluar,Dosen;
    Button btnProses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemograman_mobile);
        matakuliah = (EditText)findViewById(R.id.editMobile);
        sks = (EditText)findViewById(R.id.editSks);

        spinerHari =(Spinner)findViewById(R.id.spinHari);
        String []hari = {"Senin","Selasa","Rabu","Kamis","Jumat"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, hari);
        spinerHari.setAdapter(adapter);
        // untuk memasukan isi spineer pukul masuk
        spinerMasuk = (Spinner)findViewById(R.id.spinMasuk);
        String [] masuk = {"08.00","09.00","10.00","11.00","12.00","13.00","14.00","15.00","16.00","17.00"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, masuk);
        spinerMasuk.setAdapter(adapter2);

        // untuk memasukkan isi spinner pukul keluar
        spinerKeluar = (Spinner)findViewById(R.id.spinKeluar);
        final String [] keluar = {"08.00","09.00","10.00","11.00","12.00","13.00","14.00","15.00","16.00","17.00"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, keluar);
        spinerKeluar.setAdapter(adapter1);

        // untuk memasukkan isi spinner dosen
        spinerDosen = (Spinner)findViewById(R.id.sDosenMobile);
        final String [] dosen = {"Ir.Hanriyawan Adnan Mooduto, M.Kom","Deddy Pramaya,S.Kom.,M.ISD",
                "Cipto Prabowo,ST.,MT","Deni Satria,S.Kom.,M.Kom","Ervan Asri,S.Kom.,M.Kom",
                "Rika Idmayanti,ST.,M.Kom","H. Ikhsan Yusda Prima Putra,SH.,LLM","Aldo Erianda,S.ST.,MT",
                "Hidra Amnur,S.Kom.,SE.,M.Kom"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, dosen);
        spinerDosen.setAdapter(adapter3);


        btnProses=(Button)findViewById(R.id.btnMobile);
        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Matakuliah=matakuliah.getText().toString();
                SKS = sks.getText().toString();
                Hari=spinerHari.getSelectedItem().toString();
                JamMasuk=spinerMasuk.getSelectedItem().toString();
                JamKeluar=spinerKeluar.getSelectedItem().toString();
                Dosen=spinerDosen.getSelectedItem().toString();
                Intent intent = new Intent(PemogramanMobileActivity.this,HasilMobileActivity.class);
                intent.putExtra("hasilmobile","\nMatakuliah\t\t: "+Matakuliah+
                        "\nSKS\t\t\t\t\t\t: "+SKS+
                        "\nHari\t\t\t\t\t\t: "+Hari+
                        "\nJam Masuk\t: "+JamMasuk+
                        "\nJam Keluar\t\t: "+JamKeluar+
                        "\nDosen\t\t\t\t\t: "+Dosen);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pemograman_mobile, menu);
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
