
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
