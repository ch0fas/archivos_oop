import javax.swing.JOptionPane;

public class Act1_Ejer5
{
    public static void main(String[] args)
    {
        int distance;
        int initial_time;
        int final_time;
        float velocidad;

        distance = Integer.parseInt(JOptionPane.showInputDialog("Cuántos km recorriste? "));
        initial_time = Integer.parseInt(JOptionPane.showInputDialog("A qué hora empezaste, en minutos después de las 00:00? ")); //Siddhartha reference?
        final_time = Integer.parseInt(JOptionPane.showInputDialog("A qué hora acabaste, en minutos después de las 00:00? "));

        velocidad = 60 * (distance / (final_time - initial_time));

        JOptionPane.showMessageDialog(null, String.format("Tu velocidad promedio fue: %.2fkm/h", velocidad), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
