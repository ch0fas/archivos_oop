public class Clase5
{
    public static void main(String[] args)
    {
        // RE: Arrays
        int[][] m = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.println(m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int[] row:m)
        {
            for (int e:row)
            {
                System.out.println(e);
            }
        }

        int[][] m1;
        m1 = m.clone();
        for (int i = 0; i<m.length; i++)
        {
            m1[i] = m[i].clone();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int[] row:m1)
        {
            for (int e:row)
            {
                System.out.println(e);
            }
        }
    }
}
