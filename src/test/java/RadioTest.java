import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void test() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int exoected = 6;
        Assertions.assertEquals(exoected, actual);
    }

    @Test

    public void testminus() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();
        int actual = radio.getCurrentStation();
        int exoected = 10;
        Assertions.assertEquals(exoected, actual);
    }

    @Test
    public void next() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int exoected = 8;
        Assertions.assertEquals(exoected, actual);
    }


    @Test

    public void testplus() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.next();
        int actual = radio.getCurrentStation();
        int exoected = 0;
        Assertions.assertEquals(exoected, actual);
    }

    @Test

    public void testmin() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.prev();
        int actual = radio.getCurrentStation();
        int exoected = 9;
        Assertions.assertEquals(exoected, actual);
    }

    @Test
    public void testvol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volumePlus();
        int actual = radio.getCurrentVolume();
        int exoected = 10;
        Assertions.assertEquals(exoected, actual);
    }

    @Test
    public void testvolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumeminus();
        int actual = radio.getCurrentVolume();
        int exoected = 9;
        Assertions.assertEquals(exoected, actual);
    }


    @Test
    public void testvolMN() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeminus();
        int actual = radio.getCurrentVolume();
        int exoected = 0;
        Assertions.assertEquals(exoected, actual);
    }

    @Test
    public void testvolPL() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.volumePlus();
        int actual = radio.getCurrentVolume();
        int exoected = 10;
        Assertions.assertEquals(exoected, actual);

    }

    @Test
    public void TESTP() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumePlus();
        int actual = radio.getCurrentVolume();
        int exoected = 10;
        Assertions.assertEquals(exoected, actual);

    }

    @Test

    public void testpluss() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.next();
        int actual = radio.getCurrentStation();
        int exoected = 1;
        Assertions.assertEquals(exoected, actual);
    }

}