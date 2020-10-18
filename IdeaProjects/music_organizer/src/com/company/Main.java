package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        pop.addFile("selena gomez");
        pop.addFile("taylor swift");
        System.out.println("size of the files is " + pop.getNumberOfFiles());
//        pop.removeFile(1);
//        System.out.println("size of the files is " + pop.getNumberOfFiles());
        pop.startPlaying(0);
        pop.stopPlaying();
        pop.listFile(1);
        pop.listAllFiles();
    }
}
