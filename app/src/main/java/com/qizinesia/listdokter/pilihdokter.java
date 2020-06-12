package com.qizinesia.listdokter;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class pilihdokter extends AppCompatActivity {

    //deklarasi variabel listPlayer
    private ListView listPlayer;
    //deklarasi variabel players
    private ArrayList<Player> players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihdokter);

        //inisiasi variabel listPlayer
        listPlayer = findViewById(R.id.list_player);

        //inisiasi variabel players
        players = generateDummmyData();

        //deklarasi variabel adapter sebagai adapter untuk listPlayer
        PlayerAdapter adapter = new PlayerAdapter(this, players);

        //set variabel adapter sebagai adapter untuk listPlayer
        listPlayer.setAdapter(adapter);

        //set listener saat salah satu item di-klik
        listPlayer.setOnItemClickListener(listener);

    }

    //deklarasi variabel listener untuk digunakan menangkap event saat sebuah item di-klik
    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent detailIntent = new Intent(pilihdokter.this, DetailActivity.class);
            detailIntent.putExtra(DetailActivity.EXTRA_PLAYER, players.get(position));
            startActivity(detailIntent);
        }
    };


    //Men-generate daftar pemain secara hardcode
    private static ArrayList<Player> generateDummmyData(){
        ArrayList<Player> dummyPlayers = new ArrayList<>();

        //Player 0 :
        Player player = new Player();
        player.setPlayerName("Dokter Ke-Satu");
        player.setClubName("Senin & Kamis");

        player.setPlayerAge("30 Tahun");
        player.setImgResource(R.drawable.dktr01);

        dummyPlayers.add(player);

        //Player 1 :
        player = new Player();
        player.setPlayerName("Dokter Ke-Dua");
        player.setClubName("Senin - Jum'at");

        player.setPlayerAge("33 Tahun");
        player.setImgResource(R.drawable.dktr02);

        dummyPlayers.add(player);

        //Player 2 :
        player = new Player();
        player.setPlayerName("Dokter Ke-Tiga");
        player.setClubName("Sabtu");

        player.setPlayerAge("26 Tahun");
        player.setImgResource(R.drawable.dktr03);

        dummyPlayers.add(player);

        //Player 3 :
        player = new Player();
        player.setPlayerName("Dokter Ke-Empat");
        player.setClubName("Minggu");

        player.setPlayerAge("31 Tahun");
        player.setImgResource(R.drawable.dktr04);

        dummyPlayers.add(player);
        //dan seterusnya

        player = new Player();
        player.setPlayerName("Dokter Ke-Lima");
        player.setClubName("Senin - Minggu");

        player.setPlayerAge("25 Tahun");
        player.setImgResource(R.drawable.dktr05);

        dummyPlayers.add(player);
        return dummyPlayers;
    }

}
