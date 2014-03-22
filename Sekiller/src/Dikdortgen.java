
public class Dikdortgen {

	double kisaKenar,uzunKenar;

	public Dikdortgen(){

	}

	public void setKisaKenar(double kisaKenar) {
		if (kisaKenar <= 0)
			this.kisaKenar = 0;
		else
			this.kisaKenar = kisaKenar;
	}

	public void setUzunKenar(double uzunKenar) {
		if (uzunKenar <= 0)
			this.uzunKenar = 0;
		else
			this.uzunKenar = uzunKenar;
	}

	public double getAlan(){
		if(uzunKenar == 0 || kisaKenar == 0)
			return -1;
		return uzunKenar * kisaKenar;

	}


}

