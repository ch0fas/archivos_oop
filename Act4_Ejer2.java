public class Act4_Ejer2
{
    public static void main(String[] args)
    {
        int x = 6;
        int over_x = 0;
        int odd = 0;
        short[] v = {10,9,8,7,6,5,4,3,2,1};

        for (short e:v)
        {
            if (e < x)
            {
                over_x++;
            }
            if (e % 2 != 0)
            {
                odd++;
            }
        }
        short[] v1 = new short[over_x];
        short[] v2 = new short[odd];

        int over_index = 0;
        int odd_index = 0;

        for (short e:v)
        {
            if (e < x)
            {
                v1[over_index] = e;
                over_index++;
            }
            if (e % 2 != 0)
            {
                v2[odd_index] = e;
                odd_index++;
            }
        }
        System.out.printf("Vector Original: ");
        for (short e:v)
        {
            System.out.printf("%d ", e);
        }
        System.out.printf("\nVector de números mayores a %d: ", x);
        for (short e:v1)
        {
            System.out.printf("%d ", e);
        }
        System.out.printf("\nVector de números impares: ");
        for (short e:v2)
        {
            System.out.printf("%d ", e);
        }
    }
}
