package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //тестируем граничные значения метода прямого ввода номера радиостании (0, -1, 1, 8, 9, 10)
    @Test
    public void shouldSetRadioStationNumber1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationNumber4() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationNumber5() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationNumber6() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    //тестируем метод переключения радиостанций вперед методом граничных значений( -1+1, 0+1, 1+1, 9+1, 8+1, 10+1)
    // не забывай, что все значения < min он приравняет к нулю, затем к min, и все значения > max приравняет к нулю, затем к min
    @Test
    public void shouldChangeRadioStationNumberNext1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeRadioStationNumberNext2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeRadioStationNumberNext3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(2);

        radio.next();

        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldChangeRadioStationNumberNext4() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationNumberNext5() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationNumberNext6() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //тестируем метод переключения радиостанций назад методом граничных значений (10-1, 9-1, 8-1, 0-1, 1-1, -1-1)
    // не забывай, что все значения > max он приравнивает к 0, а если 0-1 то автоматически будет max! c < min история такая же
    @Test
    public void shouldChangeRadioStationNumberPrev1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationNumberPrev2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationNumberPrev3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationNumberPrev4() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationNumberPrev5() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeRadioStationNumberPrev6() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //тестируем метод ручного ввода уровня громкости с помощью граничных значений (-1, 0, 1, 9, 10, 11)
    @Test
    public void shouldSetVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    //тестируем метод увеличения громкости методом граничных значений (-1+1, 0+1, 1+1, 9+1, 10+1, 11+1)
    //все что < min приравнивается к 0
    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume6() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // тестируем метод уменьшения громкости граничными значениями (-1-1, 0-1, 1-1, 11-1, 10-1, 9-1)
    @Test
    public void shouldReduceVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume5() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        radio.reduceVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
