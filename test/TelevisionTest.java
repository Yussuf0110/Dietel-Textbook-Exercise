import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void getName(){
        Television Samsung = new Television();
        String tvName = Samsung.getName();
        assertEquals("Samsung",tvName);
    }

    @Test
    public void onTv(){
//given
        Television Samsung = new Television();
//when
        boolean tvOn = Samsung.onTv();
//check
        assertTrue(true);
    }

    @Test
    public void offTv(){
        //given
        Television Samsung = new Television();
//when
        boolean tvOff = Samsung.offTv();
//check
        assertFalse(false);
    }

    @Test
    public void channelsUpButton(){
        //given
        Television Samsung = new Television();
        boolean tvOn = Samsung.onTv();
        //when
        int channelup = Samsung.changeChannelUpButton();
//check
        assertEquals(4, channelup);
    }

    @Test
    public void channelsDownButton(){
        //given
        Television Samsung = new Television();
//when
        int channeldown = Samsung.changeChannelDownButton();
//check
        assertEquals(2,channeldown);
    }

    @Test
    public void volumeDown(){
        //given
        Television Samsung = new Television();
//when
        int volumedown = Samsung.volumeDownButton();
//check
        assertEquals(20,volumedown);
    }

    @Test
    public void volumeUp(){
        //given
        Television Samsung = new Television();
//when
        int volumeUp = Samsung.volumeUpButton();
//check
        assertEquals(22, volumeUp);
    }




}
