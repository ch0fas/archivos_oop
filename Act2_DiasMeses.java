import javax.swing.JOptionPane;

public class Act2_DiasMeses
{
    public static void main(String[] args)
    {
        String month;
        int year = 0;
        boolean flag = false;
        boolean is_bisiesto;
        int dias_mes;

        month = JOptionPane.showInputDialog("Escribe un mes");
        do
        {
            try
            {
                year = Integer.parseInt(JOptionPane.showInputDialog("Escribe un año"));
                flag = true;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al ingresar año, intenta de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (flag != true);

        is_bisiesto = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true: false;

        switch (month.toLowerCase().trim())
        {
            case "febrero": dias_mes = is_bisiesto ? 29: 28;
            break;
            case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre": dias_mes = 31;
            break;
            default: dias_mes = 30;
            break;
        }
        JOptionPane.showMessageDialog(null, String.format("%s tiene %d dias en %d", month.trim(), dias_mes, year), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
