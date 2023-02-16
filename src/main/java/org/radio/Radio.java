package org.radio;

public class Radio {
    public int currentVolume;
    public int currentStation;
    public int maxStation;

    public Radio(){
        maxStation = 9;
    }

    public Radio(int numStations){
        maxStation = numStations - 1;
    }

    public void setStation(int station) {
        if (station >= 0 && station <= maxStation) {
            currentStation = station;
        }
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
