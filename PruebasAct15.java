import iteso.Device;
import iteso.Phone;
import iteso.Laptop;
import iteso.Tablet;
import iteso.SmartTV;

public class PruebasAct15
{
    public static void main(String[] args)
    {
        Phone d1;
        Tablet d2;
        Laptop d3;
        SmartTV d4;

        d1 = Device.getPhone(Device.APPLE, 6.1, Device.IOS, 3200, 71);
        d2 = Device.getTablet(Device.APPLE, 10.2, Device.IOS, 8557, 79);
        d3 = Device.getLaptop(Device.HP, 15, Device.LINUX, 15000, 90);
        d4 = Device.getTV(Device.SONY, 32, Device.ANDROID);

        d1.connect5G();
        d2.connectWifi(5);
        d3.installApp("Spotify");
        d4.connectHDMI();
        d4.connectEthernet(500);
        d4.disconnectEthernet();

    }
}