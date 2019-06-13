package com.kxw.pattern.adaptor;

import org.junit.Test;

/**
 * @author kangxiongwei
 * @date 2019/6/13 10:38 PM
 */
public class AudioPlayerTest {


    @Test
    public void test() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }


}
