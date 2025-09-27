package modern;
import adapter.SmartDevice;
public class SmartLight implements SmartDevice {

    private int brightness = 100;
    @Override
    public void powerOn() {
        System.out.println(" Smart light is ON with brightness " + brightness + "%");
    }
    @Override
    public void powerOff() {
        System.out.println(" Smart light is OFF");
    }
    @Override
    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println(" Smart light brightness set to " + brightness + "%");
    }
}
