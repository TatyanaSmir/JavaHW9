package ru.netology.javaqa;

public class Radio {


    private int quantityOfRadioStation = 10;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int currentRadioStationNumber;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;


    public Radio(int quantityOfRadioStation) {
        if (quantityOfRadioStation > 0) {
            maxRadioStationNumber = minRadioStationNumber + quantityOfRadioStation - 1;
        } else {
            maxRadioStationNumber = 0;
        }
    }

    public Radio() {

    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
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

