package iteso;

public abstract class Person 
{
    private String name;
    private int age;
    private int gender;
    public static final int MALE=0, FEMALE=1, OTHER=2;
    
    public abstract void work();

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGender(int gender) { this.gender = gender; }

    // getters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public int getGender() { return this.gender; }
}
