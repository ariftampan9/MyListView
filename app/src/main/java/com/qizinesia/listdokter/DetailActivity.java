package com.qizinesia.listdokter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String EXTRA_PLAYER = "extra_player";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Button btnMulaia = findViewById(R.id.daftar);
        btnMulaia.setOnClickListener(this);


        Player selectedPlayer = getIntent().getParcelableExtra(EXTRA_PLAYER);

        if(selectedPlayer!=null){
            ImageView imgFoto = findViewById(R.id.img_player_photo);
            imgFoto.setImageResource(selectedPlayer.getImgResource());
            imgFoto.setScaleType(ImageView.ScaleType.CENTER_CROP);

            TextView txtNama = findViewById(R.id.txt_player_name);
            txtNama.setText(selectedPlayer.getPlayerName());

            TextView txtClub = findViewById(R.id.txt_club);
            txtClub.setText(selectedPlayer.getClubName());

            TextView txtAge = findViewById(R.id.txt_Age);
            txtAge.setText(selectedPlayer.getPlayerAge());
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.daftar){
            Intent selesai = new Intent(DetailActivity.this, selesai.class);
            startActivity(selesai);
        }
    }
}
