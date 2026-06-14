package iteso;

public class Car
{
    // Attributes
    private String manufacturer;
    private String name;
    private int model_year;
    private double price;

    public Car()
    {
        this.manufacturer = "Jeep";
        this.name = "Wrangler";
        this.model_year = 2006;
        this.price = 10000.00;
    }

    public Car(String manufacturer, String name, int year, double price)
    {
        this.manufacturer = manufacturer;
        this.name = name;
        this.model_year = year;
        this.price = price;
    }

    public Car clone()
    {
        return new Car(this.manufacturer, this.name, this.model_year, this.price);
    }

    public String toString()
    {
        return String.format("Manufacturer: %s\nModel Name: %s\nYear: %d\nPrice: %.2f\n", this.manufacturer, this.name, this.model_year, this.price);
    }

}