package iteso;

public class Dog extends Animal 
{
    // Special dog attributes
    private String breed;
    private String name;
    private String owner;

    public Dog()
    {
        super();
        breed = "Chihuahua";
        name = "Kira";
        owner = "Sofia";
    }

    public Dog(double weight, double age, String breed, String name, String owner)
    {
        super(weight, age);
        setBreed(breed);
        setName(name);
        setOwner(owner);
    }

    // Getters
    public String getBreed()
    {
        return this.breed;
    }

    public String getName()
    {
        return this.name;
    }

    public String getOwner()
    {
        return this.owner;
    }

    // Setters
    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    // Additional Methods

    @Override public void feed()
    {
        System.out.printf("Feeding kibble to %s\n", getName());
    }

    @Override public String toString()
    {
        return String.format("About This Dog\nName: %s. Age: %.2f. Weight: %.2f\nBreed: %s\nOwner: %s", getName(), getAge(), getWeight(), getBreed(), getOwner());
    }
    
}
