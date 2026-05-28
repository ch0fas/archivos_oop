//Sofia Maldonado
// Andrea Angulo

import javax.swing.JOptionPane;

public class Act3_Ejer3
{
    public static void main(String[] args)
    {
        float precio_usuario = 0;
        boolean flag = false, negative_flag = false;
        do
        {
            try
            {
                precio_usuario = Float.parseFloat(JOptionPane.showInputDialog(null, "Escribe el precio del producto: "));
                flag = true;
            }
            catch (NumberFormatException e)
            {
            JOptionPane.showMessageDialog(null, "Este no es un número, intenta de nuevo", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            if (precio_usuario > 0)
            {
                negative_flag = true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Escribe un numero mayor a cero", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } while (flag != true || negative_flag != true);
        JOptionPane.showMessageDialog(null, String.format("Tu precio final va a ser de $%.2f + $%.2f de IVA", precio_usuario, precio_usuario*.16), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
