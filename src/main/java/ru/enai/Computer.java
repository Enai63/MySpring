package ru.enai;

import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final MusicPlayer musicPlayer;
    private long id;


    public Computer(MusicPlayer musicPlayer) {
        this.id = ++id;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer: " + id + " " + musicPlayer.playMusic();
    }
}
