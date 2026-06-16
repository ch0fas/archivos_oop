package iteso;

public class Profesor extends Persona 
{
    // Atributos especiales
    protected String gradoAcademico;
    protected String departamentoAdscrito;
    protected int jornadaLaboral;

    public Profesor()
    {
        super();
        setGrado("Especialidad");
        setDepa("MAF");
        setJornada(8);
    }

    public Profesor(String nombre, String paterno, String materno, String genero, int edad, String grado, String depa, int jornada)
    {
        super(nombre, paterno, materno, genero, edad);
        setGrado(grado);
        setDepa(depa);
        setJornada(jornada);
    }


    // Getters
    public String getGrado()
    {
        return this.gradoAcademico;
    }

    public String getDepa()
    {
        return this.departamentoAdscrito;
    }

    public int getJornada()
    {
        return this.jornadaLaboral;
    }

    // Setters
    public void setGrado(String grado)
    {
        this.gradoAcademico = grado;
    }

    public void setDepa(String depa)
    {
        this.departamentoAdscrito = depa;
    }

    public void setJornada(int jornada)
    {
        this.jornadaLaboral = jornada;
    }

    @Override public String toString()
    {
        return String.format("");
    }
}
