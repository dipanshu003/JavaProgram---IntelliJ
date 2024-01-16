package com.MockTest.MusicLibrary;

import java.util.ArrayList;
import java.util.Collections;

public class MusicLibrary {
    //    Write a Java program to create a class called "MusicLibrary" with a
//    collection of  songs and methods to add and remove songs,
//    and to play a random song.

    ArrayList songs;

    MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void playSong() {
        Collections.shuffle(songs);
        System.out.println("Now Playing Song is : " + songs.get(0));
    }

    public void dispSong() {
        for (Object o : songs) {
            System.out.println(o);
        }
    }


    public static void main(String[] args) {
        MusicLibrary m = new MusicLibrary();
        m.addSong("Ae dil hai mushkil");
        m.addSong("Maa tuje salam");
        m.addSong("Pahle Kabhi");

        m.dispSong();
        m.playSong();
    }
}
