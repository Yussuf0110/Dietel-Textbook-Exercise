package AirConditioner;

public class AC {
    private String name;
    private int temperature=16;
    private boolean isOn;

    public AC() {
        this.name = name;
    }

    public String getName(){
        return "LG";
    }

    public boolean isOn() {
        isOn = true;
        return true;
    }

    public boolean isOff() {
        isOn = false;
        return false;
    }

    public int increaseTemperature() {
        if(temperature > 0 && temperature < 30){
            temperature+=1;
        }return temperature;
    }

    public int decreaseTemperature() {
        if(temperature > 16){
            temperature-=1;
        }return temperature;
    }

    public int temperatureLimit() {
        for ( temperature = 1;temperature <30;temperature++);
        return temperature;
    }

}
