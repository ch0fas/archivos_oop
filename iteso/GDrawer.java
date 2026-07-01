package iteso;

public class GDrawer<Type> // Este <Type> establece que es genérico. Type es una convención, no obligatorio
{
	private Type objectInside = null;
	public void put(Type o)
	{
		if (this.objectInside == null) this.objectInside = o;
	}
	
	public Type peek()
	{
		return this.objectInside;
	}
	
	public Type remove()
	{
		Type tmp = this.objectInside;
		objectInside = null;
		return tmp;
	}

    public String toString()
    {
        if (objectInside == null)
        {
            return String.format("Empty drawer");
        } else
        {
            return String.format("Drawer contains: %s", objectInside.toString());
        }
    }
}