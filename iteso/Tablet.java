package iteso;

public class Tablet extends Device implements Wifi
{
    // Atributos
    Battery b;

    Tablet(int manufacturer, double screen_size, int os, int mAh, double percentage)
    {
        if (manufacturer >= 1 && manufacturer <= 6)
        {
            this.manufacturer = manufacturer;
        } else this.manufacturer = Device.APPLE;
        if (screen_size >= 4 && screen_size <= 15)
        {
            this.screen_size = screen_size;
        } else this.screen_size = 10.2;
        if (os >= 1 && os <= 8)
        {
            this.os = os;
        } else this.os = Device.IOS;
        b = new Battery(mAh, percentage);
    }

    // Metodos
    @Override
    public boolean statusEncendido()
    {
        return this.turnedOn;
    }

    public void getRed()
    {
        if (this.connection_type == 1)
        {
            System.out.println("You are connected to Wi-Fi!");
        } else
        {
            System.out.println("You are not connected to Wi-Fi");
        }
    }

    public double getBattery()
    {
        return b.getPercentage();
    }

    @Override
    public void turnOn()
    {
        if (this.turnedOn)
        {
            System.out.println("The tablet was already turned on!");
        } else
        {
            this.turnedOn = true;
            System.out.println("The tablet has turned on!");
        }
    }

    @Override
    public void turnOff()
    {
        if (!this.turnedOn)
        {
            System.out.println("The tablet was already turned off!");
        } else
        {
            this.turnedOn = false;
            System.out.println("Turning tablet off...");
        }
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
        this.connection_type = 0;
        System.out.println("You were disconneted from Wi-Fi");
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