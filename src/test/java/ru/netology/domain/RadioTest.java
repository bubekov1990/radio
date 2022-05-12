package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test
    void getCurrentVolume() {
        Radio service = new Radio();
        int expected = 0;
        ;
        assertEquals(expected, service.getCurrentVolume());
    }

    @Test
    void setCurrentVolume() {
        Radio service = new Radio();
        assertEquals(10, service.setCurrentVolume(10));
    }

    @Test
    void setCurrentVolume1() {
        Radio service = new Radio();
        assertEquals(100, service.setCurrentVolume(100));
    }

    @Test
    void increaseVolume() {
        Radio service = new Radio();
        assertEquals(2, service.increaseVolume(1));
    }

    @Test
    void increaseVolume1() {
        Radio service = new Radio();

        assertEquals(100, service.getMaxVolume());
    }

    @Test
    void lowerVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(2);
        service.lowerVolume();
        assertEquals(1, service.getCurrentVolume());
    }

    @Test
    void lowerVolume1() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);
        service.lowerVolume();
        assertEquals(0, service.getMinVolume());
    }

    @Test
    void setCurrentTrack() {
        Radio track = new Radio();
        track.setCurrentTrack(9);
        assertEquals(9, track.getCurrentTrack());
    }

    @Test
    void setCurrentTrack1() {
        Radio track = new Radio();
        track.setCurrentTrack(10);
        assertEquals(0, track.getMinTrack());
    }

    @Test
    void setCurrentTrack2() {
        Radio track = new Radio();
        track.setCurrentTrack(-1);
        assertEquals(9, track.getMaxTrack());
    }

    @Test
    void nextTrack() {
        Radio track = new Radio();
        track.setCurrentTrack(7);
        track.nextTrack();
        assertEquals(8, track.getCurrentTrack());
    }

    @Test
    void prevTrack1() {
        Radio track = new Radio();
        track.setCurrentTrack(-1);
        track.nextTrack();
        assertEquals(9, track.getMaxTrack());
    }

    @Test
    void prevTrack() {
        Radio track = new Radio();
        track.setCurrentTrack(7);
        track.prevTrack();
        assertEquals(6, track.getCurrentTrack());
    }

    @Test
    void nextTrack1() {
        Radio track = new Radio();
        assertEquals(0, track.setCurrentTrack(10));
    }

    @Test
    void setAmount() {
        Radio track = new Radio();
        assertEquals(10, track.getAmount());
    }

    @Test
    void setAmount1() {
        Radio track = new Radio();
        assertEquals(9, track.setCurrentTrack(9));
    }

    @Test
    void amount() {
        Radio track = new Radio(8);
        assertEquals(8, track.getAmount());
    }

    @Test
    void shouldSetAny() {
        Radio track = new Radio(20);

        int expected = 15;
        int actual = track.setCurrentTrack(15);

        assertEquals(expected, actual);


    }
}