package ru.netology.oop100;

public class Radio {
    private int currentStationNumber;
    private int volumeSound;

    public void nextCurrentStationNumber() {
        if (currentStationNumber != 9) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }

    }

    public void prevCurrentStationNumber() {
        if (currentStationNumber != 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = 9;
        }

    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getVolumeSound() {

        return volumeSound;
    }

    public void nextVolumeSound() {
        if (volumeSound != 10) {
            volumeSound++;
        } else {
            volumeSound = 0;
        }
    }

    public void prevVolumeSound() {
        if (volumeSound != 0) {
            volumeSound--;
        } else {
            volumeSound = 10;
        }

    }

    public void setVolumeSound(int volumeSound) {
        if (volumeSound < 0) {
            return;
        }
        if (volumeSound > 10) {
            return;
        }

        this.volumeSound = volumeSound;
    }

}


