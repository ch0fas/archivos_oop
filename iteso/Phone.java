package iteso;

public class Phone extends Device implements Wifi
{
    // Atributos
    protected Battery b;

    Phone(int manufacturer, double screen_size, int os, int mAh, double percentage)
    {
        if (manufacturer >= 1 && manufacturer <= 6)
        {
            this.manufacturer = manufacturer;
        } else this.manufacturer = Device.APPLE;
        if (screen_size >= 4 && screen_size <= 15)
        {
            this.screen_size = screen_size;
        } else this.screen_size = 6.1;
        if (os >= 1 && os <= 8)
        {
            this.os = os;
        } else this.os = Device.IOS;
        b = new Battery(mAh, percentage);
    }

    // Métodos
    @Override
    public boolean statusEncendido()
    {
        return this.turnedOn;
    }

    public String getRed()
    {
        if (this.connection_type == Device.WIFI)
        {
            return "You are connected to Wi-Fi";
        } else if (this.connection_type == Device.LTE)
        {
            return "You are connected via LTE";
        } else if (this.connection_type == Device.CINCOG)
        {
            return "You are connected to 5G";
        } else return "You are not connected to any network";
    }

    public double getBattery()
    {
        return b.getPercentage();
    }

    @Override
    public void turnOn()
    {
        if (turnedOn)
        {
            System.out.println("The device is already turned on!");
        } else
        {
            this.turnedOn = true;
            System.out.println("Device was turned on!");
        }
    }

    @Override
    public void turnOff()
    {
        if (!turnedOn)
        {
            System.out.println("The device is already turned off");
        } else
        {
            this.turnedOn = false;
            System.out.println("Turning off...");
        }
    }

    public void connectLTE()
    {
        this.connection_type = Device.LTE;
        System.out.println("Connected to LTE");
    }

    public void connect5G()
    {
        this.connection_type = Device.CINCOG;
        System.out.println("Connected to 5G");
    }

    @Override
    public void connectWifi(int standard)
    {
        if (standard == 2 || standard == 4 || standard == 5 || standard == 6)
        {
            this.connection_type = Device.WIFI;
            System.out.printf("Connecting to Wi-Fi %d\n", standard);
        } else
        {
            System.out.println("There was an error connecting to Wi-Fi. Please try again");
        }
    }

    @Override
    public void disconnectWifi()
    {
        this.connection_type = Device.LTE;
        System.out.println("You have disconnected from Wi-Fi");
    }

    public void call(int number)
    {
        System.out.printf("Calling %d\n");
    }

    @Override
    public void installApp(String app)
    {
        System.out.printf("Installing %s\n", app);
    }

    @Override
    public void uninstallApp(String app)
    {
        System.out.printf("Uninstalling %\n", app);
    }


}
