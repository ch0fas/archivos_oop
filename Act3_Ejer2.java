// Sofia Maldonado
// Andrea Angulo

import javax.swing.JOptionPane;

public class Act3_Ejer2
{
    public static void main(String[] args)
    {
        double pi_valor_mult = 1.0;
        int num_operandos;
        num_operandos = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuántas operaciones quieres hacer?"));
        for (int i = 1; i <= num_operandos; i++)
        {
            if (i % 2 != 0) pi_valor_mult -= 1.0/((i*2)+1); else pi_valor_mult += 1.0/((i*2)+1);
        }
        JOptionPane.showMessageDialog(null, String.format("Con %d operandos, aproximas un valor de PI de: %.10f", num_operandos, (4*pi_valor_mult)), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
