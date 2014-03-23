
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

	public int compareArea(Daire daire){		
		int bigger;	
		
		if(daire.getAlan() == this.getAlan())	
			bigger = 0;
		
		else if(daire.getAlan() > this.getAlan())	
			bigger = -1;
		
		else 	
			bigger = 1;
		
		return bigger;		
	}
	
	public int compareArea(Kare kare){		
		int bigger;	
		
		if(kare.getAlan() == this.getAlan())	
			bigger = 0;
		
		else if(kare.getAlan() > this.getAlan())	
			bigger = -1;
		
		else 	
			bigger = 1;
		
		return bigger;		
	}
	
	public int compareArea(Ucgen ucgen){		
		int bigger;	
		
		if(ucgen.getAlan() == this.getAlan())	
			bigger = 0;
		
		else if(ucgen.getAlan() > this.getAlan())	
			bigger = -1;
		
		else 	
			bigger = 1;
		
		return bigger;		
	}
	
	public int compareArea(Dikdortgen dikdortgen){		
		int bigger;	
		
		if(dikdortgen.getAlan() == this.getAlan())	
			bigger = 0;
		
		else if(dikdortgen.getAlan() > this.getAlan())	
			bigger = -1;
		
		else 	
			bigger = 1;
		
		return bigger;		
	}
	
	public int compareArea(ParalelKenar paralelKenar){		
		int bigger;	
		
		if(paralelKenar.getAlan() == this.getAlan())	
			bigger = 0;
		
		else if(paralelKenar.getAlan() > this.getAlan())	
			bigger = -1;
		
		else 	
			bigger = 1;
		
		return bigger;		
	}









}
