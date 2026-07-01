import iteso.GDrawer;
import iteso.RGBColor;
import iteso.ColorDrawer;
import iteso.Ouroboros;

public class Act19
{
    public static void main(String[] args) 
    {
        GDrawer<String> drawer = new GDrawer<>();
        String greeting = "Hello";  

        RGBColor color = new RGBColor(105, 30, 6);
        ColorDrawer color_drawer = new ColorDrawer();

        Ouroboros own_storage = new Ouroboros();
        Ouroboros own_2 = new Ouroboros();

        System.out.println(drawer); // Imprimiendo sin que haya nada aún
        drawer.put(greeting);
        System.out.println(drawer);

        color_drawer.put(color);
        System.out.println(color_drawer.peek());

        own_storage.put(own_2); // Poniendo un contenedor dentro de otro del mismo tipo
        System.out.println(own_storage);

    }
}