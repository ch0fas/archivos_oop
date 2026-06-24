package iteso;

public class Usb{
	//Tipo
	public static final int USB2_0 = 1;
	public static final int USB3_0 = 2;
	public static final int USB3_1 = 3;
	public static final int USB3_2 = 4;

	protected int type = 0;

	public Usb() {
	}

	public Usb(int type) {
		setType(type);
	}

	public void setType(int type) {
		if(type>=1 && type<=4)
			this.type = type;
	}

	public int getType() {
		return type;
	}
}