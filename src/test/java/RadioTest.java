import org.junit.jupiter.api.Test;
import org.radio.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void nextStation(){
        Radio radio = new Radio();
        radio.next();

        int exp = 1;
        int act = radio.getCurrentStation();

        assertEquals(exp, act);
    }

    @Test
    void prevStation(){
        Radio radio = new Radio(1, 0);
        radio.prev();

        int exp = 0;
        int act = radio.getCurrentStation();

        assertEquals(exp, act);
    }

    @Test
    void prevFirstStation(){
        Radio radio = new Radio();
        radio.prev();

        int exp = 9;
        int act = radio.getCurrentStation();

        assertEquals(exp, act);
    }

    @Test
    void nextLastStation(){
        Radio radio = new Radio(9, 0);
        radio.next();

        int exp = 0;
        int act = radio.getCurrentStation();

        assertEquals(exp, act);
    }

    @Test
    void setStation(){
        Radio radio = new Radio();
        radio.setStation(5);

        int exp = 5;
        int act = radio.getCurrentStation();

        assertEquals(exp, act);
    }

    @Test
    void setWrongStation(){
        Radio radio = new Radio();
        radio.setStation(50);

        int exp = 0;
        int act = radio.getCurrentStation();

        assertEquals(exp, act);
    }

    @Test
    void setNegativeStation(){
        Radio radio = new Radio();
        radio.setStation(-5);

        int exp = 0;
        int act = radio.currentStation;

        assertEquals(exp, act);
    }

    @Test
    void setUpLimitStation(){
        Radio radio = new Radio();
        radio.setStation(10);

        int exp = 0;
        int act = radio.currentStation;

        assertEquals(exp, act);
    }

    @Test
    void incVolume(){
        Radio radio = new Radio();
        radio.increaseVolume();

        int exp = 1;
        int act = radio.getCurrentVolume();

        assertEquals(exp, act);
    }

    @Test
    void decVolume(){
        Radio radio = new Radio(0, 1);
        radio.decreaseVolume();

        int exp = 0;
        int act = radio.getCurrentVolume();

        assertEquals(exp, act);
    }

    @Test
    void decZeroVolume(){
        Radio radio = new Radio();
        radio.decreaseVolume();

        int exp = 0;
        int act = radio.getCurrentVolume();

        assertEquals(exp, act);
    }

    @Test
    void incMaxVolume(){
        Radio radio = new Radio(0, 10);
        radio.increaseVolume();

        int exp = 10;
        int act = radio.getCurrentVolume();

        assertEquals(exp, act);
    }
}
