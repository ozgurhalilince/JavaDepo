
public class Circle {


	double radius,area,perimeter;

	public Circle(){
		radius = 0;
	}

	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius < 0)
			radius = 0;
		else
			this.radius = radius;
		area = radius * radius * Math.PI;
		perimeter = 2 * radius * Math.PI;
	}

	public double getArea(){		
		return area;		
	}

	public double getPerimeter(){
		return perimeter;
	}

	public int compareArea(Square s){

		int bigger = 0;

		if(s.getArea() > getArea())
			bigger = -1;

		if(getArea() > s.getArea())
			bigger = 1;

		if(getArea() == s.getArea())
			bigger = 0;

		return bigger;
	}


}
