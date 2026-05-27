// Sofia Maldonado
// Andrea Angulo Flores

import javax.swing.JOptionPane;

public class Act2_Colores
{
    public static void main(String[] args)
    {
        int user_color = 0;
        int red = 0, green = 0, blue = 0;
        boolean flag = false;
        float c, m, y, k, largest_color_delta;
        float red_delta, green_delta, blue_delta;
        do
        {
            try
            {
                user_color = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu color RGB en hexadecimal"),16);
                flag = true;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Hubo un error, intentalo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
        while (flag != true);

        red = user_color >> 16;
        green = user_color >> 8 & 0xFF;
        blue = user_color & 0xFF;

        red_delta = red/255.0f;
        green_delta = green/255.0f;
        blue_delta = blue/255.0f;

        largest_color_delta = red_delta > (green_delta>blue_delta ? green_delta:blue_delta) ? red_delta:((green_delta > blue_delta) ? green_delta:blue_delta);
        // Calculando los valores CMYK
        k = 1 - largest_color_delta;
        c = (1-red_delta-k) / (1-k);
        m = (1-green_delta-k) / (1-k);
        y = (1-blue_delta-k) / (1-k);
        JOptionPane.showMessageDialog(null, String.format("Colores RGB: (%.2f, %.2f, %.2f)\nColores CMYK: (%.2f, %.2f, %.2f, %.2f)", red_delta, green_delta, blue_delta, c, m, y, k), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
