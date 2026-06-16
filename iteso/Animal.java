package iteso;

public class Animal
{
    // Atrributes
    protected double weight;
    protected double age;

    public Animal()
    {
        weight = 0.0;
        age = 0.0;
    }

    public Animal(double weight, double age)
    {
        setWeight(weight);
        setAge(age);
    }

    // Getters
    public double getWeight()
    {
        return this.weight;
    }

    public double getAge()
    {
        return this.age;
    }

    // Setters
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setAge(double age)
    {
        this.age = age;
    }

    // Additional Methods
    public void feed()
    {
        System.out.println("Animal Successfully Fed!");
    }

    public void vaccinate()
    {
        System.out.println("Animal Successfully Vaccinated!");
    }


    public String toString()
    {
        return String.format("Weight: %.2f\nAge: %.2f", getWeight(), getAge());
    }
}