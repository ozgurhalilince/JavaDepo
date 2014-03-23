
public class Daire {

	double yaricap;
	
	public Daire(){
		
	}
	
	public void setYaricap(double yaricap){
		if (yaricap<0)
			this.yaricap = 0;
		else
		this.yaricap = yaricap;
	}
	
	
	public double getAlan(){
		if(yaricap == 0 )
			return -1;
		return ( Math.PI * yaricap * yaricap );

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
