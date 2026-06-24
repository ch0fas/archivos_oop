package iteso;

public abstract class Device
{
    // Atributos universales
    protected int manufacturer;
    protected double screen_size;
    protected int os;
    protected boolean turnedOn = false;
    protected int connection_type;
    public static final int APPLE = 1, SAMSUNG = 2, HP = 3, DELI = 4, HISENSE = 5, SONY = 6; // Manufacturers
    public static final int WINDOWS = 1, LINUX = 2, IOS = 3, ANDROID = 4, GOOGLETV = 5, ROKU = 6, TIZEN = 7, WEBOS = 8; // Operating Systems
    public static final int PHONE = 1, TABLET = 2, LAPTOP = 3, TV = 4; // Device Types
    public static final int WIFI = 1, LTE = 2, CINCOG = 3, ETHERNET = 4;

    // Get Instances
    public static Phone getPhone(int manufacturer, double screen_size, int os, int mAh, double percentage)
    {
        return new Phone(manufacturer, screen_size, os, mAh, percentage);
    }

    public static Tablet getTablet(int manufacturer, double screen_size, int os, int mAh, double percentage)
    {
        return new Tablet(manufacturer, screen_size, os, mAh, percentage);
    }

    public static Laptop getLaptop(int manufacturer, double screen_size, int os, int mAh, double percentage)
    {
        return new Laptop(manufacturer, screen_size, os, mAh, percentage);
    }

    public static SmartTV getTV(int manufacturer, double screen_size, int os)
    {
        return new SmartTV(manufacturer, screen_size, os);
    }

    public abstract boolean statusEncendido();
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void installApp(String app_name);
    public abstract void uninstallApp(String app_name);
}