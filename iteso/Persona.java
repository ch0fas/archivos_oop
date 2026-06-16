package iteso;

public class Persona 
{
    // Attributes
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected final String genero;
    protected int edad;
    
    public Persona()
    {
        this.nombre = "Viviana";
        this.apellidoPaterno = "Toledo";
        this.apellidoMaterno = "de la Fuente";
        this.genero = "X";
        this.edad = 21; // Allegedly
    }

    public Persona(String nombre, String paterno, String materno, String genero, int edad)
    {
        setNombre(nombre);
        setPaterno(paterno);
        setMaterno(materno);
        this.genero = genero;
        setEdad(edad);
    }

    // Getters
    public String getName()
    {
        return this.nombre;
    }

    public String getPaterno()
    {
        return this.apellidoPaterno;
    }

    public String getMaterno()
    {
        return this.apellidoMaterno;
    }

    public String getGender()
    {
        return this.genero;
    }

    public int getEdad()
    {
        return this.edad;
    }

    // Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno)
    {
        this.apellidoPaterno = paterno;
    }

    public void setMaterno(String materno)
    {
        this.apellidoMaterno = materno;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    // Adicionales
    public String toString()
    {
        return String.format("Persona!\nNombre: %s %s %s\nGenero: %s\nEdad: %d", getName(), getPaterno(), getMaterno(), getGender(), getEdad());    
    }
}
