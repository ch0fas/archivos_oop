import java.util.Random;

public class Act7_Exp2
{
    public static void main(String[] args)
    {
        Random r = new Random();
        for (int i = 0; i < 10000; i++)
        {
            double[] arr = new double[10000000];
            arr[0] = r.nextDouble();
        }

        System.out.println("Finalizado");
    }
}
