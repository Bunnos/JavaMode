package com.bran.adaptor;

/**
 * @author antiumbo
 * @date on 2018/5/23
 **/
public class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:"+fileName);
    }
}
