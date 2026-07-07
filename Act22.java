import geometry.shapes2d.Rectangle;
import java.util.TreeMap;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Act22
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle(2, 2, 0, 0);
        Rectangle r2 = new Rectangle(5, 10, 0, 0);
        TreeSet<Rectangle> ts1 = new TreeSet<>();
        ts1.add(r1);
        ts1.add(r2);
        TreeMap<Integer, Rectangle> tm1 = new TreeMap<>();
        tm1.put(0, r1);
        tm1.put(1, r2);
        PriorityQueue<Rectangle> pq1 = new PriorityQueue<>();
        pq1.add(r1);
        pq1.add(r2);
        
        System.out.println(r1.compareTo(r2));
    }

    
}
