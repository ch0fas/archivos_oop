import java.util.*;

public class PreEx4 
{
    
    public static void moveNumbers(ArrayList<Number> dest, ArrayList<? extends Number> src)
    {
        for (Number num: src)
        {
            dest.add(num);
        }

        for (Number num: dest)
        {
            System.out.println(num.doubleValue());
        }
    }
    
    public static void main(String[] args) 
    {
        ArrayList<Integer> src = new ArrayList<>();
        src.add(1);
        src.add(2);
        src.add(3);
        src.add(6);
        ArrayList<Number> dest = new ArrayList<>();

        moveNumbers(dest, src);
    }    
}
