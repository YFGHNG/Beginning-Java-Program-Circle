public class Circle //Class 
{
	
	Circle ( ) { } 
	
	public void setR(int r) {	//Radius initializer, courtesy of stackoverflow.com
    this.r = r;
	}
		
	int r;
	
	double area() {
		return Math.PI*r*r;
	}
	double diameter( ) 
	{
			return 2 * r;
	}

	double circumference( ) {
		return Math.PI * 2 * r;
	}

	int getR( ) {
		return r;
	}
}
