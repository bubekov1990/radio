package ru.netology.domain;

public class Radio {

    private int amount = 10 ;
    private int minTrack = 0;
    private int currentTrack;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int maxTrack = 9;


    public Radio() {

    }

    public Radio(int amount) {
        this.amount = amount;
    }

    public int getMinTrack() {
        return minTrack;
    }

    public int getMaxTrack() {
        this.maxTrack = amount - 1;
        return maxTrack;
    }

    public int getMinVolume() {
        return minVolume;
    }
    public int getMaxVolume(){
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getAmount() {
        return amount;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > 0 & currentVolume < 100) {
            this.currentVolume = currentVolume;
            return currentVolume;
        }
        return maxVolume;
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }

    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
            return this.currentVolume;
        }
        return maxVolume;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public int setCurrentTrack(int currentTrack) {
        if (currentTrack >= 0 & currentTrack <= amount -1) {
            this.currentTrack = currentTrack;
        } else {
            this.currentTrack = 0;
        }
        return this.currentTrack;
    }




    public void nextTrack() {
        if (currentTrack > 0) {
            currentTrack++;
        } else {
            this.currentTrack = getMaxTrack();
        }
    }

    public void prevTrack() {
        if (currentTrack < 9) {
            currentTrack--;
        } else {
            this.currentTrack = getMinTrack();
        }
    }

}



