package com.qizinesia.listdokter;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {

    private String playerName;
    private String clubName;
    private String playerAge;
    private String position;
    private int goalCount;

    private int imgResource;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(String playerAge) {
        this.playerAge = playerAge;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.playerName);
        dest.writeString(this.clubName);
        dest.writeString(this.playerAge);
        dest.writeString(this.position);
        dest.writeInt(this.goalCount);
        dest.writeInt(this.imgResource);
    }

    public Player() {
    }

    protected Player(Parcel in) {
        this.playerName = in.readString();
        this.clubName = in.readString();
        this.playerAge = in.readString();
        this.position = in.readString();
        this.goalCount = in.readInt();
        this.imgResource = in.readInt();
    }

    public static final Parcelable.Creator<Player> CREATOR = new Parcelable.Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel source) {
            return new Player(source);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
