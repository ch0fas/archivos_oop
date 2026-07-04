import java.util.TreeSet;

public class Act20_Ejer2
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> pq1 = new TreeSet<>();
        pq1.add(100);
        pq1.add(150);
        pq1.add(120);
        pq1.add(100);
        pq1.add(180);
        pq1.add(200);
        pq1.add(120);
        pq1.add(180);
        pq1.add(100);
        
        System.out.println(pq1.size()); // Es menos de 9, ya que solo guarda los números únicos. Tmb los guarda en orden directamente
        for (int e:pq1)
        {
            System.out.println(e);
        }
    }
}
