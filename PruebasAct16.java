import iteso.Motherboard;
import iteso.Cpu;
import iteso.Storage;
import iteso.Memory;
import iteso.Usb;

public class PruebasAct16
{
    public static void main(String[] args)
    {
        Cpu cp1 = new Cpu(Cpu.R5, 6, 3.6);
        Storage st1 = new Storage(Storage.SSD, 1024);
        Memory mem1 = new Memory(Memory.DDR4, 48);
        Usb[] ports;
        ports = new Usb[] {new Usb(4), new Usb(4), new Usb(4), new Usb(4), new Usb(4), new Usb(4)};
        Motherboard mb1 = new Motherboard(Motherboard.ASUS, "B550", Motherboard.AMD, mem1, cp1, st1, ports);
        System.out.println(mb1);
    }
}