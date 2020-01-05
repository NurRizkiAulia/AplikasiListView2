package id.ac.poliban.mi.aulia.aplikasilistview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> mahasiswa = new ArrayList<>();

    {
        mahasiswa.add("Eko Asdy Wibowo Saputra");
        mahasiswa.add("Fenia Dwi Maulida");
        mahasiswa.add("Firda Kharisma");
        mahasiswa.add("Hendra Gunawan");
        mahasiswa.add("Hini Amaliah");
        mahasiswa.add("Insan Norcahyo");
        mahasiswa.add("Maisarah");
        mahasiswa.add("Maulida Rahmi");
        mahasiswa.add("Mayadiah Atikasari");
        mahasiswa.add("Molida Junida");
        mahasiswa.add("Muhammad Auzan");
        mahasiswa.add("Muhammad Hafiz Anshari");
        mahasiswa.add("Muhammad Rizki Fahmi");
        mahasiswa.add("Nia Karlida Yanti");
        mahasiswa.add("Nur Rizki Aulia");
        mahasiswa.add("Octa Pasaribu");
        mahasiswa.add("Sari Rahma Maulida");
        mahasiswa.add("Wardatul Hisaniah");
        mahasiswa.add("Wenny Lisandra");
        mahasiswa.add("Ahmad Yusfanhafizh");
        mahasiswa.add("Sri Wahyuni");
        mahasiswa.add("Haifa Mai Suci");
        mahasiswa.add("Muhammad Rasyad Sultansyah");
        mahasiswa.add("Hendri Pratama");
        mahasiswa.add("Risma Sari");
        mahasiswa.add("M Tri Utomo");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ubah judul di Action Bar
        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Nama Mahasiswa");

        //daftarkan view untuk dimanipulasi
        ListView ListView = findViewById(R.id.list_view);

        //buat Adapter
        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.item_nama_mahasiswa, R.id.tv_nama_mahasiswa,mahasiswa);

        ListView.setAdapter(adapter);

        //event handling (jangan lupa aktifkan java 1.8)
        ListView.setOnItemClickListener((parent, view, position, id) ->
            Toast.makeText(this, "anda mengklik " +
                    mahasiswa.get(position), Toast.LENGTH_SHORT).show());
    }
}