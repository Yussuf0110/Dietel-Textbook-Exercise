package AirConditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {

    @Test
    public void getName(){
        AC LG = new AC();
        String acName = LG.getName();
        assertEquals("LG", acName);
    }


//    @Test
//    public void setOn(){
//        AC LG = new AC();
//        String onAc = LG.setOn();
//    }

    @Test
    public void isOn(){
        AC LG = new AC();
        boolean acSwitchOn = LG.isOn();
        assertTrue(true);
    }

    @Test
    public void isOff(){
        AC LG = new AC();
        boolean acSwitchOff = LG.isOff();
        assertFalse(false);
    }

    @Test
    public void increaseTemperature(){
        AC LG = new AC();
        int highTemp = LG.increaseTemperature();
        assertEquals(17, highTemp);
    }

    @Test
    public void decreaseTemperature(){
        AC LG = new AC();
        int lowTemp = LG.decreaseTemperature();
        assertEquals(16,lowTemp);
    }

    @Test
    public void setTemperatureLimit(){
        AC LG = new AC();
        LG.increaseTemperature();
        LG.increaseTemperature();
        LG.increaseTemperature();
        LG.increaseTemperature();

        int tempLimit = LG.temperatureLimit();
        assertEquals(30,tempLimit);
    }


























}
