package ru.netology.javaqa;

public class Radio {
    int currentRadioStationNumber;
    int currentVolume;
    int minRadioStationNumber = 0;
    int maxRadioStationNumber = 9;
    int minVolume = 0;
    int maxVolume = 10;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            setCurrentRadioStationNumber(minRadioStationNumber);
        } else {
            setCurrentRadioStationNumber(currentRadioStationNumber + 1);
        }

    }

    public void prev() {
        if (currentRadioStationNumber == minRadioStationNumber) {
            setCurrentRadioStationNumber(maxRadioStationNumber);
        } else {
            setCurrentRadioStationNumber(currentRadioStationNumber - 1);
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setCurrentRadioStationNumber(maxVolume);
        }

    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setCurrentVolume(minVolume);
        }
    }


}

