import javax.swing.JOptionPane;

import geometry.shapes2d.Rectangle;

public class Act7_Exp1
{
    public static void main(String[] args)
    {
        String foo = "";
        Rectangle r1 = new Rectangle(10, 20, 0, 0);
        Rectangle r2 = new Rectangle(15, 15, 100, 100);
        Rectangle r3 = new Rectangle(20, 50, 200, 300);

        r2 = new Rectangle(40, 40, 50, 50);

        System.gc(); // No imprime nada por si solo, darle un nuevo objeto a la variable llama al GC aunque no se haga manual
        foo = JOptionPane.showInputDialog(null, "Escribe lo que sea, esta es una pausa");

        r2 = null;

        System.gc();
    }
}
