package iteso;

public class Memory{

	//Tipo
	public static final int DDR3 = 1;
	public static final int DDR4 = 2;
	public static final int DDR5 = 3;

	private int capacity =0;
	private int type = 0;

	//Constructores
	public Memory() {
	}

	public Memory(int type, int capacity)
	{
		setType(type);
		setCapacity(capacity);
	}

	//Setters
	public void setType(int type) {
		if(type>=0 && type<=3)
			this.type = type;
	}

	public void setCapacity(int capacity) {
		if(capacity >=8 && capacity <=64)
		this.capacity = capacity;
	}

	//Getters
	public int getType() {
		return type;
	}

	public int getCapacity() {
		return capacity;
	}


}