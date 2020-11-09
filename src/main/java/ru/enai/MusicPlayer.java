package ru.enai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final RockMusic rockMusic;
    private final ClassicalMusic classicalMusic;

    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }


    public String  playMusic() {
        return "Playing: " + rockMusic.getSong();
    }
}
