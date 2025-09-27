import adapter.LightBulbAdapter;
import adapter.SmartDevice;
import legacy.OldLightBulb;
import modern.SmartLight;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartLight = new SmartLight();
        smartLight.powerOn();
        smartLight.setBrightness(60);
        smartLight.powerOff();
        System.out.println("-----");

        SmartDevice adaptedOldBulb = new LightBulbAdapter(new OldLightBulb());
        adaptedOldBulb.powerOn();
        adaptedOldBulb.setBrightness(80);
        adaptedOldBulb.powerOff();
    }
}

