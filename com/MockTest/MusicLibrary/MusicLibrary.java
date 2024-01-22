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

    public void removeSong(int index) {
        if (!songs.isEmpty()) {
            songs.remove(index);
            System.out.println("Song remove Successfuly...");
        } else {
            System.out.println("No Songs There .. Add Some Songs.");
        }

    }

    public void playSong() {
        System.out.println("------------------------------");
        System.out.println("***Playing Song***");

        if (!songs.isEmpty()) {
            Collections.shuffle(songs);
            System.out.println("Now Playing Song is : " + songs.get(0));
        } else {
            System.out.println("No Song in Your Playlist...");
        }
        System.out.println("------------------------------");

    }

    public void dispSong() {
        System.out.println("------------------------------");
        System.out.println("***Displaying Songs***");
        if (!songs.isEmpty()) {
            for (Object o : songs) {
                System.out.println(o);
            }
        }
        else {
            System.out.println("No songs in Your Playlist...");
        }
        System.out.println("------------------------------");
    }


    public static void main(String[] args) {
        MusicLibrary m = new MusicLibrary();
        m.addSong("Ae dil hai mushkil");
        m.addSong("Maa tuje salam");
        m.addSong("Pahle Kabhi");

        m.removeSong(0);
        m.dispSong();

//        m.dispSong();
//        m.playSong();
    }
}
