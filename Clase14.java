import iteso.Animal;
import iteso.Dog;

public class Clase14 
{
    public static void main(String[] args) 
    {
        Animal a = new Animal(15, 3);
        System.out.println(a);
        a.feed();
        a.vaccinate();
        System.out.println();

        Dog d = new Dog(4, 14, "Chihuahua", "Chochita", "Viviana");
        System.out.println(d);
        d.feed();
        d.vaccinate();
    }    
}
