public class PostEx2
{
    public static void main(String[] args)
    {
        String str = "1";
        int x = 60;
        int y = 4;

        try
        {
            y = Integer.parseInt(str);
            x /= y;
        } catch (NumberFormatException ex)
        {
            x = 1;
        } catch (Exception ex)
        {
            y = 0;
        }
        System.out.printf("x=%d, y=%d",x,y);
    }
}