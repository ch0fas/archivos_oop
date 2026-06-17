import iteso.DateTime;
import iteso.Date;

public class TestDateTime 
{
    public static void main(String[] args) 
    {
        DateTime time1 = new DateTime();
		DateTime time2 = new DateTime(0, 26, 3);
		DateTime time3 = new DateTime(2017, 12, 31, 11, 59,59);
		DateTime time4 = time3.clone();
        time4.next();
		Date date5 = new Date(2017, 12, 31);
		DateTime time6 = new DateTime(2018, 1, 1, 11, 59, 59);
		
		DateTime time2_2 = time2.clone();
		
		if (time2.equals(time2_2))
			System.out.println("time2 y su clon son iguales");
 
		if (time3.equals(date5))
			System.out.println("time3 y date5 son iguales en contenido");
		
		if (time3 == date5)
			System.out.println("time3 y date5 son iguales en memoria");
		
		if (date5.equals(time3))
			System.out.println("time3 y date5 son iguales en fecha");
    }    
}
