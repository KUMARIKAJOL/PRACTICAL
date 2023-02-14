package kajol.com;
// Area of the circle pi*r*r
class AggregationEg{ // class 1
	int squre(int r) { // method name square
		return r*r;
			
	}
}
public class Circle { // class 2
	double pi = 3.14;
	double area(int radius) { // circle class method
		AggregationEg ref_var = new AggregationEg();
		int psqure = ref_var.squre(radius); //
		return pi* psqure; // area
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5); // 3.14*5*5
		System.out.println("Area:"+result);
		
	}
	}


