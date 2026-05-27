import javax.swing.JOptionPane;

public class Clase3
{
    public static void main(String[] args)
    {
        int n1, n2;
        try
        {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero: "));
            JOptionPane.showMessageDialog(null, String.format("Resultado: %d", n1+n2), "Operacion", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Hubo un error en los datos, recuerda que debes ingresar valores enteros", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
