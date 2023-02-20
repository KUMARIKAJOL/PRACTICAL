package kajol.com;
//super keyword vareiable which refer immediate parent class (method,con)
// 3 uses of super keyword
// 3---refer immediate parent class constructor
class Shape2 { // parent class
	// constructor of parent class 
	Shape2()
	{
		System.out.println("Hello");
		
	}
}
class Size2 extends Shape2{ // child class
	// constructor of the child class 
	Size2(){
		// invoke immediate parent class constructor line 7
		super();
		System.out.println("hi");
		
	}
}
class Supercons {
	public static void main(String[] args) {
		Size2 obj= new Size2(); // creating obj of child class
		
	}

}
