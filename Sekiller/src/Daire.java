
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
	
	
	
}
