package ru.netology.oop100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    @Test
    public void testCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testNotCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void testNoteCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(5);
        int expected = 5;
        int actual = radio.getVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNotVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(11);
        int expected = 0;
        int actual = radio.getVolumeSound();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNoteVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(-1);
        int expected = 0;
        int actual = radio.getVolumeSound();
        Assertions.assertEquals(expected, actual);
    }


}
