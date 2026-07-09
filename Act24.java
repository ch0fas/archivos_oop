import iteso.HelloWorld;
import iteso.Person;

public class Act24 
{
    public static void main(String[] args) 
    {
        HelloWorld saludoEsp = new HelloWorld() 
        {
            public void greet() { System.out.println("Hola Mundo"); }    
            public void greetSomeone(String name) { System.out.println(String.format("Hola %s, cómo estás?", name)); }
        };
        
        HelloWorld saludoEng = new HelloWorld() 
        {
            public void greet() { System.out.println("Hello World"); }    
            public void greetSomeone(String name) { System.out.println(String.format("Hello %s, how are you?", name)); }
        };

        HelloWorld salutationFr = new HelloWorld() 
        {
            public void greet() { System.out.println("Bonjour, le monde"); }    
            public void greetSomeone(String name) { System.out.println(String.format("Bonjour %s, comment allez-vous?", name)); }    
        };

        String sofi = "Sofia";
        saludoEsp.greet();
        saludoEsp.greetSomeone(sofi);
        saludoEng.greet();
        saludoEng.greetSomeone(sofi);
        salutationFr.greet();
        salutationFr.greetSomeone(sofi);

        Person student = new Person() 
        {
            @Override
            public void work() { System.out.println(String.format("The student %s is taking a class", getName())); }        
        };

        Person professor = new Person() 
        {
            @Override
            public void work() { System.out.println(String.format("The professor %s is giving a class", getName())); }    
        };

        student.setName(sofi);
        student.setAge(21);
        student.setGender(Person.FEMALE);
        professor.setName("Luis");

        student.work();
        professor.work();

        
        
    }    
}
