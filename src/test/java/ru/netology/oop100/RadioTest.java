package ru.netology.oop100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void testNextCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(3);
        radio.nextCurrentStationNumber();

        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNoteNextCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);
        radio.nextCurrentStationNumber();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(3);
        radio.prevCurrentStationNumber();

        int expected = 2;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNotPrevCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);
        radio.prevCurrentStationNumber();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);

    }


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
    public void testNextVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(3);
        radio.nextVolumeSound();

        int expected = 4;
        int actual = radio.getVolumeSound();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNoteNextVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(10);
        radio.nextVolumeSound();

        int expected = 0;
        int actual = radio.getVolumeSound();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(3);
        radio.prevVolumeSound();

        int expected = 2;
        int actual = radio.getVolumeSound();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNotePrevVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(10);
        radio.prevVolumeSound();

        int expected = 9;
        int actual = radio.getVolumeSound();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNotPrevVolumeSound() {
        Radio radio = new Radio();
        radio.setVolumeSound(0);
        radio.prevVolumeSound();

        int expected = 10;
        int actual = radio.getVolumeSound();
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
