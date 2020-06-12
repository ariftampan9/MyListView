package com.qizinesia.listdokter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayerAdapter extends BaseAdapter {

    Context context;
    ArrayList<Player> players;

    public PlayerAdapter(Context context, ArrayList<Player> ourPlayers){
        this.context = context;
        this.players = ourPlayers;
    }

    @Override
    public int getCount() {
        return players.size();
    }

    @Override
    public Object getItem(int i) {
        return players.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view==null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.layout_player_item, null);

            holder.imgFoto = view.findViewById(R.id.img_player_photo);
            holder.txtNama = view.findViewById(R.id.txt_player_name);
            holder.txtKlub = view.findViewById(R.id.txt_club);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        holder.imgFoto.setImageResource(players.get(i).getImgResource());
        holder.imgFoto.setScaleType(ImageView.ScaleType.CENTER_CROP);
        holder.txtNama.setText(players.get(i).getPlayerName());
        holder.txtKlub.setText(players.get(i).getClubName());

        return view;
    }

    static class ViewHolder {
        ImageView imgFoto;
        TextView txtNama;
        TextView txtKlub;
    }
}
