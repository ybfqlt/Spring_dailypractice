package com4.concert;

import soundsystem.xmlconfig.CompactDisc;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public BlankDisc(){}
    public BlankDisc(String title, String artist){
        this.title=title;
        this.artist=artist;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setArtist(String artist){
        this.title=title;
    }
    public void play(){
        System.out.println("Playing "+title+" by "+artist);
    }
}
