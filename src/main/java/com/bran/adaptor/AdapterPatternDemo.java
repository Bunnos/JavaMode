package com.bran.adaptor;

/**
 * @author antiumbo
 * @date on 2018/5/23
 **/
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp3");
        audioPlayer.play("vlc","far far away.mp3");
        audioPlayer.play("avi","mind me.avi");
    }
}
