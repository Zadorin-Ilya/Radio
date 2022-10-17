public class Radio {
       
    protected int currentVolume;
    protected int currentStation;

    protected int maxStation;

    public Radio() {
        maxStation = 10;
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
        if (currentVolume > 10) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
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
            currentStation = 0;

        }

    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
    }

    public void volumePlus() {
        if (currentVolume < 10) {
         currentVolume++;
        }
        else { currentVolume = 10;}
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

