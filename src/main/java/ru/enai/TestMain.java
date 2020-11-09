package ru.enai;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appliactionContext.xml");
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
