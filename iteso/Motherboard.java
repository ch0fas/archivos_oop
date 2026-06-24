package iteso;

public class Motherboard
{
    // Atributos
    protected int brand;
    protected String model;
    protected int socket;
    protected Memory memory_type; // Agregación
    protected Cpu processor; 
    protected Storage storage; 
    protected USB[] ports = new USB[6];
    public static final int ASUS = 0, MSI = 1, GIGABYTE = 2, ASROCK = 3;
    public static final int INTEL = 0, AMD = 1;
    public static final String[] brands = {"Asus", "MSI", "Gigabyte", "ASRock"};
    public static final String[] sockets = {"Intel", "AMD"};

    public Motherboard()
    {
        this.brand = Motherboard.ASUS;
        this.model = "B550";
        this.socket = Motherboard.AMD;
        this.memory_type = new Memory();
        this.processor = new Cpu(Cpu.R5, 6, 3.6);
        this.storage = new Storage();
        this.USB = {new USB(), new USB(), new USB(), new USB(), new USB(), new USB()};
    }

    public Motherboard(int brand, String model, int socket, int mem_type, Cpu processor, Storage storage, USB[] usb)
    {
        setBrand(brand);
        setModel(model);
        setSocket(socket);
        setMemory(mem_type);
        setProcessor(processor);
        setStorage(storage);
        setUSB(usb);
    }

    // Setters
    public void setBrand(int brand)
    {
        if (brand >= 0 && brand <= 3)
        {
            this.brand = brand;
        } else this.brand = Motherboard.ASUS;
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

    public void setProcessor(Cpu processor)
    {
        this.processor = processor;
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }

    public void setUSB(USB[] ports)
    {
        this.ports = ports;
    }





}
