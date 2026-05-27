// Sofía Maldonado

import javax.swing.JOptionPane;

public class Act2_DistanciaTiempo
{
    public static void main(String[] args)
    {
        float velocidad = 0, distancia_restante = 0, km_min, min_restantes;
        int min_para_llegar = 0;
        boolean flag = false;

        do
        {
            try
            {
                velocidad = Float.parseFloat(JOptionPane.showInputDialog("Escribe tu velocidad, en km/h: "));
                distancia_restante = Float.parseFloat(JOptionPane.showInputDialog("Cuántos km te faltan? "));
                min_para_llegar = Integer.parseInt(JOptionPane.showInputDialog("Cuántos minutos tienes para llegar? "));
                flag = true;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, String.format("Hubo un error al ingresar los datos, intentalo de nuevo"), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (!flag);

        km_min = velocidad/60;
        min_restantes = distancia_restante / km_min;

        if ((distancia_restante/km_min) > min_para_llegar)
        {
            JOptionPane.showMessageDialog(null, "No vas a llegar a tiempo", "Resultado", JOptionPane.WARNING_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Vas a llegar a tiempo", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
