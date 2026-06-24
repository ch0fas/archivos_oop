package iteso;

public class Laptop extends Device implements Wifi, Ethernet
{
    // Atributos
    Battery b;

    Laptop(int manufacturer, double screen_size, int os, int mAh, double percentage)
    {
        if (manufacturer >= 1 && manufacturer <= 6)
        {
            this.manufacturer = manufacturer;
        } else this.manufacturer = Device.HP;
        if (screen_size >= 4 && screen_size <= 20)
        {
            this.screen_size = screen_size;
        } else this.screen_size = 13;
        if (os >= 1 && os <= 8)
        {
            this.os = os;
        } else this.os = Device.LINUX;
        b = new Battery(mAh, percentage);
    }

    // Metodos
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
        } else if (this.connection_type == Device.ETHERNET)
        {
            return "You are connected to Ethernet!";
        } else return "You are not connected to the internet";
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
            System.out.println("The Laptop is already turned on!");
        } else
        {
            this.turnedOn = true;
            System.out.println("Laptop was turned on!");
        }
    }

    @Override
    public void turnOff()
    {
        if (!turnedOn)
        {
            System.out.println("The laptop is already turned off");
        } else
        {
            this.turnedOn = false;
            System.out.println("Turning off...");
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
        System.out.println("You have disconnected from Wi-Fi");
    }

    @Override
    public void connectEthernet(int speed)
    {
        if (speed >= 100 && speed <= 1000)
        {
            this.connection_type = Device.ETHERNET;
            System.out.println("You have connected to Ethernet");
        } else
        {
            System.out.println("There was an error connecting to Ethernet. Please try again!");
        }
    }

    @Override
    public void disconnectEthernet()
    {
        this.connection_type = 0;
        System.out.println("You have disconnected from Ethernet");
    }

    @Override
    public void installApp(String app_name)
    {
        System.out.printf("Installing %s to your laptop!\n", app_name);
    }

    @Override
    public void uninstallApp(String app_name)
    {
        System.out.printf("Uninstalling %s from your laptop\n", app_name);
    }

}