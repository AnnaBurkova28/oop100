package ru.netology.oop100;

public class Radio {
    private int maxStation;


    private int currentStationNumber;
    private int volumeSound;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;

    }

    public void nextCurrentStationNumber() {
        if (currentStationNumber != maxStation) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }

    }

    public void prevCurrentStationNumber() {
        if (currentStationNumber != 0) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStation;
        }

    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > maxStation) {
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


