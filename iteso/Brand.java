package iteso;

public enum Brand
{
    ASUS("Asus"), GIGABYTE("GIGABYTE"), MSI("MSI"), ASROCK("ASRock");
    private final String name;
    private Brand(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return this.name;
    }

}