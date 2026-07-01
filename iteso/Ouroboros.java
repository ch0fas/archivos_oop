package iteso;

public class Ouroboros 
{
    private Ouroboros self_inside = null;
    
    public void put(Ouroboros self_item)
    {
        if (this.self_inside == null) this.self_inside = self_item;
    }

    public Ouroboros peek()
    {
        return this.self_inside;
    }

    public Ouroboros remove()
    {
        Ouroboros tmp = this.self_inside;
        this.self_inside = null;
        return tmp;
    }
}
