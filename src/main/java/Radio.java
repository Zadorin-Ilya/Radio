public class Radio {
    protected int maxStation = 9;
    protected int minStation = 0;
    protected int currentStation = minStation;
    protected int currentVolume;




    public Radio() {
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
            return;
        } else {
            currentStation = minStation;

        }

    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
    }

    public void volumePlus() {
        if (currentVolume < 100) {
         currentVolume++;
        }
        else { currentVolume = 100;}
    }

    public void volumeminus() {
        if (currentVolume > 0) {
            currentVolume--;
            return;
        } else {
            currentVolume = 0;
        }
    }
}

