
public class Kare {

	double kenar;

	public Kare()
	{

	}

	public void setKenar(double kenar)
	{
		if (kenar < 0)
			this.kenar = 0;
		else
			this.kenar = kenar;
	}
	public double getAlan() 
	{
		if(kenar == 0)
			return -1;
		return kenar*kenar;
	}


}
