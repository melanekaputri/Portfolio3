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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


public class DataMahasiswaActivity extends Activity {
    Spinner spinner;
    EditText nama,nobp,jurusan;
    RadioButton tk, mi, rpl;
    Button submitData;
    RadioGroup radioGroup;
    String Nama, Nobp,Kelas,Prodi,Jurusan,pilihankelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);
        spinner = (Spinner)findViewById(R.id.spinerKelas);
        final String[]kelas = {"1B","1A","1C","2A","2B","2C","3A","3B","3C"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, kelas);
        spinner.setAdapter(adapter);

        nama = (EditText)findViewById(R.id.editNama);
        nobp = (EditText)findViewById(R.id.editNobp);
        jurusan = (EditText)findViewById(R.id.editJurusan);
        radioGroup =(RadioGroup)findViewById(R.id.radioGroup);
        tk = (RadioButton)findViewById(R.id.rbTK);
        mi = (RadioButton)findViewById(R.id.rbMI);
        rpl = (RadioButton)findViewById(R.id.rbRPL);
        submitData = (Button)findViewById(R.id.btnSubmitData);
        submitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pilihankelas();
                Nama = nama.getText().toString();
                Kelas = spinner.getSelectedItem().toString();
                Nobp = nobp.getText().toString();
                Prodi = pilihankelas;
                Jurusan = jurusan.getText().toString();
                Intent intent = new Intent(DataMahasiswaActivity.this, HasilActivity.class);
                intent.putExtra("hasildata","Nama \t\t\t: "+Nama+"\nNO BP \t\t\t: "+Nobp+
                        "\nJurusan\t\t: "+Jurusan+ "\nKelas \t\t\t: "+Kelas+ "\nProdi  \t\t\t: "+Prodi);
                startActivity(intent);

            }

            private void pilihankelas() {
                if(tk.isChecked()){
                    pilihankelas = tk.getText().toString();
                }
                else if(mi.isChecked()){
                    pilihankelas = mi.getText().toString();
                }
                else if(rpl.isChecked()){
                    pilihankelas= rpl.getText().toString();
                }
            }
        });




    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_data_mahasiswa, menu);
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
