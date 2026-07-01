package iteso;

public class ColorDrawer 
{
    private RGBColor color_inside = null;

    public void put(RGBColor color)
    {
        if (this.color_inside == null) this.color_inside = color;
    }

    public RGBColor peek()
    {
        return this.color_inside;
    }

    public RGBColor remove()
    {
        RGBColor tmp = this.color_inside;
        this.color_inside = null;
        return tmp;
    }
}
