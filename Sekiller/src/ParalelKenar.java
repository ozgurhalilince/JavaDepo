
public class ParalelKenar {

	double yukseklik,taban;

	
		public ParalelKenar(){
			
		}
		
		public void setYukseklik(double yukseklik) {
			if (yukseklik <= 0)
				this.yukseklik = 0;
			else
				this.yukseklik = yukseklik;
		}
		
		public void setTaban(double taban) {
			if (taban <= 0)
				this.taban = 0;
			else
				this.taban = taban;
		}

		public double getAlan(){
			if(yukseklik == 0 || taban == 0)
				return -1;
			return (taban * yukseklik) / 2;

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

	}
