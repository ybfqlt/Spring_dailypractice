package com4.concert;


import java.util.ArrayList;
import java.util.List;

public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;
    List<String> tracks = new ArrayList<String>();

    public BlankDisc(){}
    public BlankDisc(String title, String artist){
        this.title=title;
        this.artist=artist;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setArtist(String artist){
        this.artist=artist;
    }
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
    public void setTracks(List<String> tracks){
        this.tracks=tracks;
    }
    public void playTrack(int trackNumber){
        System.out.println("trackNumber ="+trackNumber);

    }
}
