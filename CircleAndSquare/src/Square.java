
public class Square {

	double lenght,area,perimeter;

	public Square(){

	}

	public Square(double lenght){
		this.lenght = lenght;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {

		if(lenght < 0)
			lenght = 0;
		else
			this.lenght = lenght;
		area = lenght * lenght;
		perimeter = 4 * lenght;

	}

	public double getArea(){		
		return area;		
	}

	public double getPerimeter(){
		return perimeter;
	}

	@SuppressWarnings("unused")
	private int compareArea(Circle c){

		int bigger = 0;

		if(c.getArea() > getArea())
			bigger = -1;

		if(getArea() > c.getArea())
			bigger = 1;

		if(getArea() == c.getArea())
			bigger = 0;	

		return bigger;
	}

}
