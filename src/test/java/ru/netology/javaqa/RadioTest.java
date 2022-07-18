package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "9, 9",
            "10, 0"
    })

    public void ShouldNotSetQuantityOfRadioStation(int currentRadioStationNumber, int expected){
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(currentRadioStationNumber);

        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 0",
            "20, 19"
    })
    public void shouldSetQuantityOfRadioStation(int quantityOfRadioStation, int expected) {

        Radio radio = new Radio(quantityOfRadioStation);

        Assertions.assertEquals(expected, radio.getMaxRadioStationNumber());

    }
    Radio radio = new Radio(20);
    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            " 0, 0",
            " 1, 1",
            "18, 18",
            "19, 19",
            "20, 0"
    })
    public void shouldSetRadioStationNumber(int currentRadioStationNumber, int expected) {

        radio.setCurrentRadioStationNumber(currentRadioStationNumber);

        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @ParameterizedTest //все значения > max приравниваются к нулю!
    @CsvSource({
            "-1, 1",
            "0, 1",
            "1, 2",
            "18, 19",
            "19, 0",
            "20, 1" // значение 20 он приравнял к нулю, поэтому переключает на 1
    })

    public void shouldChangeRadioStationNumberNext(int currentRadioStationNumber, int expected) {
        radio.setCurrentRadioStationNumber(currentRadioStationNumber);

        radio.next();

        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());

    }

    @ParameterizedTest
    @CsvSource({
            "20, 19",// 20 приравнял к 0, а при достижении 0 если минус станция, то переключается на максимальный
            "19, 18",
            "18, 17",
            "1, 0",
            "0, 19",
            "-1, 19"
    })

    public void shouldChangeRadioStationNumberPrev(int currentRadioStationNumber, int expected) {

        radio.setCurrentRadioStationNumber(currentRadioStationNumber);

        radio.prev();

        Assertions.assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 1",
            "99, 99",
            "100, 100",
            "101, 100"
    })

    public void shouldSetVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 1",
            "0, 1",
            "1, 2",
            "99, 100",
            "100, 100",
            "101, 100"
    })

    public void shouldIncreaseVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        radio.increaseVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "-1, 0",
            "0, 0",
            "1, 0",
            "101, 99",
            "100, 99",
            "99, 98"
    })

    public void shouldReduceVolume(int currentVolume, int expected) {

        radio.setCurrentVolume(currentVolume);

        radio.reduceVolume();

        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

}
