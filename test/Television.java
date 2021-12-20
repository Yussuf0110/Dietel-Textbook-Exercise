public class Television {

private String name;
private int channel;
private int volume=100;
private boolean switchOn;


    public String getName() {
        return "Samsung";
    }

    public boolean onTv() {
        switchOn = true;
        return true;
    }

    public boolean offTv() {
    switchOn = false;
    return false;
    }

    public int changeChannelUpButton() {
        if (channel < 50);
        channel++;
        return channel;
    }

    public int changeChannelDownButton() {
        if (channel >1 && channel <50){
            channel--;
        }return channel;
    }

    public int volumeDownButton() {
        if(volume >1 && volume < 100){
            volume--;
        }return volume;
    }

    public int volumeUpButton() {
        if (volume < 100){
            volume++;
        }return volume;
    }
}
