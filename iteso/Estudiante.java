package iteso;

public class Estudiante extends Persona 
{
    // Atributos Especiales
    protected String planEstudios;
    protected int creditosCursados;
    protected int semestresCursados;

    public Estudiante()
    {
        super();
        this.planEstudios = "Ciencia de Datos";
        this.creditosCursados = 67;
        this.semestresCursados = 6;
    }

    public Estudiante(String name, String paterno, String materno, String genero, int edad, String plan, int creds, int semestres)
    {
        super(name, paterno, materno, genero, edad);
        setPlan(plan);
        setCreditos(creds);
        setSemestres(semestres);
    }

    // Getters
    public String getPlan()
    {
        return this.planEstudios;
    }

    public int getCreditos()
    {
        return this.creditosCursados;
    }

    public int getSemestres()
    {
        return this.semestresCursados;
    }

    // Setters
    public void setPlan(String plan)
    {
        this.planEstudios = plan;
    }

    public void setCreditos(int creds)
    {
        this.creditosCursados = creds;
    }

    public void setSemestres(int semestres)
    {
        this.semestresCursados = semestres;
    }

    // Adicionales
    @Override public String toString()
    {
        return String.format("Estudiante!\nNombre: %s %s %s\nEdad: %d\nGenero: %s\nPlanEstudios: %s\nCreditos, Semestres: %d %d", getName(), getPaterno(), getMaterno(), getEdad(), getGender(), getPlan(), getCreditos(), getSemestres());    
    }
}
