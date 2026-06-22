package iteso;

public class Box extends Shape3D{
	private double lado;

	public void setLado(double lado) {
	    if (lado>=0 && lado<=100)
		{
		    this.lado = lado;
		} else this.lado = 1;

	}

	Box(int x, int y, int z, double lado) {
        if (x >= 0)
        {
            this.x = x;
        }
        if (y >= 0)
        {
            this.y = y;
        }
        if (z >= 0)
        {
            this.z = z;
        }
        setLado(lado);

	}

	public double getArea() {
		return lado*lado*6;
	}

	public double getVolume() {
		return lado*lado*lado;
	}

	public String toString()
	{
	    return String.format("CAJA\nArea: %.2f. Volumen: %.2f.\n%s", getArea(), getVolume(), super.toString());
	}

}