package com.bignerbranch.android.mediaplayer;

/**
 * Created by becha on 9/8/17.
 */

public class SongInfo {
    public String Path;
    public String song_name;
    public String album_name;
    public String artist_name;

    public SongInfo(String Path, String song_name, String album_name, String artist_name){
        this.album_name = album_name;
        this.artist_name = artist_name;
        this.Path = Path;
        this.song_name = song_name;

    }
}
