
public class Yamuk {

	double altTaban, ustTaban, yukseklik;

	public Yamuk(){

	}

	public void setAltTaban(double altTaban) {
		if (altTaban <= 0)
			this.altTaban = 0;
		else
			this.altTaban = altTaban;
	}

	public void setUstTaban(double ustTaban) {
		if (ustTaban <= 0)
			this.ustTaban = 0;
		else
			this.ustTaban = ustTaban;
	}

	public void setYukseklik(double yukseklik) {
		if (yukseklik <= 0)
			this.yukseklik = 0;
		else
			this.yukseklik = yukseklik;
	}

	public double getAlan(){
		if(yukseklik == 0 || ustTaban == 0 || altTaban == 0)
			return -1;
		return (((altTaban + ustTaban) * yukseklik ) / 2);
	}










}
