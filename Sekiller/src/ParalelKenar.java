
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
		
	}
