package ru.netology.oop100;

public class Radio {
    private int currentStationNumber;
    private int volumeSound;

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