public class Act4_Ejer1
{
    public static void main(String[] args)
    {
        double[][] a = {{1.5, 3.5},
                        {5.5, 7.5}};
        double[][] b = {{0.5, 2.5},
                        {4.5, 6.5}};
        double[][] c = new double[2][2];

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (double[] row:c)
        {
            for (double e:row)
            {
                System.out.println(e);
            }
            System.out.println();
        }
    }
}
