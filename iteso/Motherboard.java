package iteso;

public class Motherboard
{
    // Atributos
    protected Brand brand;
    protected String model;
    protected int socket;
    protected Memory memory_type; // Asociación
    protected Processors processor; // Asociación
    protected Storage storage; // Asociación
    protected Usb[] ports = new Usb[6]; // Agregación, no es común cambiar el IO de una tarjeta madre
    public static final int ASUS = 0, MSI = 1, GIGABYTE = 2, ASROCK = 3;
    public static final int INTEL = 0, AMD = 1;
    public static final String[] brands = {"Asus", "MSI", "Gigabyte", "ASRock"};
    public static final String[] sockets = {"Intel", "AMD"};

    public Motherboard()
    {
        this.brand = Brand.ASUS;
        this.model = "B550";
        this.socket = Motherboard.AMD;
        this.memory_type = new Memory();
        this.processor = Processors.RYZEN5;
        this.storage = new Storage();
        this.ports = new Usb[] {new Usb(4), new Usb(4), new Usb(4), new Usb(4), new Usb(4), new Usb(4)};
    }

    public Motherboard(Brand brand, String model, int socket, Memory memory, Processors processor, Storage storage, Usb[] usb)
    {
        setBrand(brand);
        setModel(model);
        setSocket(socket);
        setMemory(memory);
        setProcessor(processor);
        setStorage(storage);
        setUSB(usb);
    }

    // Setters
    public void setBrand(Brand brand)
    {
        for (Brand e:Brand.values())
        {
            if (e == brand)
            {
                this.brand = brand;
            }
        }
        if (this.brand == null) this.brand = Brand.ASUS;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setSocket(int socket)
    {
        if (socket == 0 || socket == 1)
        {
            this.socket = socket;
        } else this.socket = Motherboard.AMD;
    }

    public void setMemory(Memory memory)
    {
        this.memory_type = memory;
    }

    public void setProcessor(Processors processor)
    {
        for (Processors e:Processors.values())
        {
            if (e == processor)
            {
                this.processor = processor;
            }
        }
        if (this.processor == null) this.processor = Processors.RYZEN5;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }

    public void setUSB(Usb[] ports)
    {
        this.ports = ports;
    }

}
