package iteso;

public enum Processors
{
    CORE3("Intel Core i3"), CORE5("Intel Core i5"), CORE7("Intel Core i7"), CORE9("Intel Core i9"), RYZEN3("AMD Ryzen 3"), RYZEN5("AMD Ryzen 5"), RYZEN7("AMD Ryzen 7"), RYZEN9("AMD Ryzen 9");
    private final String name;
    private Processors(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return this.name;
    }
}