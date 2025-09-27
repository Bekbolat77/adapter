package adapter;
import legacy.OldLightBulb;
public class LightBulbAdapter implements SmartDevice {

    private final OldLightBulb oldBulb;

    public LightBulbAdapter(OldLightBulb oldBulb) {
        this.oldBulb = oldBulb;
    }
    @Override
    public void powerOn() {
        oldBulb.turnOn();
    }
    @Override
    public void powerOff() {
        oldBulb.turnOff();
    }
    @Override
    public void setBrightness(int level) {
        System.out.println("Old bulb does not support brightness control!");
    }
}
