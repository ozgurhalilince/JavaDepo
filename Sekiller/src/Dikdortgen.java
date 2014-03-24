
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
	
	public int compareArea(Yamuk yamuk){		
		int bigger;	
		
		if(yamuk.getAlan() == this.getAlan())	
			bigger = 0;
		
		else if(yamuk.getAlan() > this.getAlan())	
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

