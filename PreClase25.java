import java.util.*;

public class PreClase25
{
    public static <Type> int frequency(Collection<Type> collection, Type object)
    {
        int counter = 0;
        for (Type e:collection)
        {
            if (e.equals(object))
            {
                counter++;
            }
        }

        return counter;
    }

    public static int greatestInteger(Collection<Integer> collection)
    {
	    Integer greatest = null;
	    for (int e:collection)
	    {
		    if (greatest == null || e > greatest)
		    {
			    greatest = e;
		    }
	    }
	
	    return greatest;
    }

    public static void changeQueue(Queue<? super Number> dest, Queue<Number> src)
    {
	    Number element = src.poll();
	    dest.add(element);
	
	    System.out.println(dest);
    }
    
    public static void main(String[] args) 
    {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<Integer> t1 = new ArrayList<>();
        PriorityQueue<Object> pq1 = new PriorityQueue<>();
        PriorityQueue<Number> pq2 = new PriorityQueue<>();

        l1.add("hola");
        l1.add("adios");
        l1.add("hola");

        t1.add(15);
        t1.add(20);
        t1.add(18);

        pq2.add(15);
        pq2.add(20);

        System.out.println(frequency(l1, "hola"));
        System.out.println(frequency(l1, "adios"));
        System.out.println(frequency(l1, "bien"));

        System.out.println(greatestInteger(t1));

        changeQueue(pq1, pq2);


    }
}