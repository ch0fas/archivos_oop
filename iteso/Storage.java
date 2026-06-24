package iteso;

public class Storage
{

	//Tipo

	private int type = 0;
	private int capacity =0;
	public static final int HDD = 1;
	public static final int SSD = 2;


	//Constructores
	public Storage() {
	}

	public Storage(int type, int capacity)
	{
		setType(type);
		setCapacity(capacity);
	}

	//Setters
	public void setType(int type) {
		if(type>=0 && type<=1)
			this.type = type;
		}

	public void setCapacity(int capacity) {
		if(capacity>=480 && capacity<=10000)
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