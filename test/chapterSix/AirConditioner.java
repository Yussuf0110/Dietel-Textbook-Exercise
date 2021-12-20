package chapterSix;

public class AirConditioner {
    private String name;
    private int temperature;
    private boolean isOn;

    public void setName (String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int increaseTemperature () {
        if (temperature > 30){
            temperature = temperature + 1;
        }return temperature;
    }

    public int decreaseTemperature () {
        if (temperature < 30) {
            temperature = temperature - 1;
        }return temperature;
    }

    public void setOn (boolean on) {
        isOn = true;
    }
    public String isOn() {
        return "true";
    }

}
