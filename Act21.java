import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.HashSet;
import java.util.Collection;
import java.util.List;
import java.util.ArrayDeque;
import iteso.Date;

public class Act21
{
    public static <Type> void collectionPrint(Collection<Type> collection)
    {
        for (Type e:collection)
        {
            System.out.println(e);
        }
    }

    public static <Type> int frequency(List<Type> list, Type object)
    {
        int counter = 0;
        for (Type e:list)
        {
            if (e.equals(object))
            {
                counter++;
            }
        }
        
        return counter;
    }

    public static double greatestNumber(Collection<Number> collection) 
    {

        Number G = null;

        for(Number N : collection)

        if(G == null || N.doubleValue() > G.doubleValue()) G = N;

        return G.doubleValue();

    }

    public static void extractAD(ArrayDeque<Number> src, ArrayDeque<Object> dest)
    {
        Number tmp = null;
        while (src.size() > 0)
        {
            tmp = src.poll();
            dest.add(tmp);
        }

        System.out.println(dest);
    }
    
    public static void main(String[] args) 
    {
        ArrayList<Number> al1 = new ArrayList<>();
        al1.add(2.3);
        al1.add(5);
        LinkedList<Integer> ll1 =  new LinkedList<>();
        ll1.add(6);
        ll1.add(7);
        Stack<Date> s1 = new Stack<>();
        s1.add(new Date());
        s1.add(new Date(2026, 7, 6));
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Hola");
        hs1.add("Mundo");
        hs1.add("Hola");
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(10);
        hs2.add(11);
        HashSet<Number> hs3 = new HashSet<>();
        hs3.add(2.5);
        hs3.add(-1);
        ArrayDeque<Number> ad1 = new ArrayDeque<>();
        ad1.add(2.5);
        ad1.add(9);
        ArrayDeque<Object> ad2 = new ArrayDeque<>();

        collectionPrint(al1);
        collectionPrint(ll1);
        collectionPrint(s1);
        collectionPrint(hs1);

        // greatestNumber(hs2); Falla ya que greatestNumber espera una colección de números, no específicamente de Integer
        greatestNumber(hs3);

        extractAD(ad1, ad2);
    }
}