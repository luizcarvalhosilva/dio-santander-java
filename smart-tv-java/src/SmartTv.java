public class SmartTv {
    boolean start = true;
    int channel = 1;
    int volume = 5;

    public void turnOn(){
        start = true;
    }

    public void turnOff(){
        start = false;
    }

    public void increaseVolume(){
        if (volume < 100) volume++;
    }

    public void decreaseVolume(){
        if (volume > 0) volume--;
    }

    public void muteTv(){
        volume = 0;
    }

    public void changeChannel(int newChannel){
        if (newChannel > 0) channel = newChannel;
    }

    public void forwardChannel(){
        channel++;
    }

    public void backwardChannel(){
        if (channel > 1) channel--;
    }
}