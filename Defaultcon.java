package kajol.com;
// display default constructor
public class Defaultcon {
	int age;
	String name;
	void show () {//method to display nd name (user defined)
	System.out.println(age+ " "+name);}
	public static void main(String[] args) {
		//1st object for name & age
		Defaultcon d=new  Defaultcon();
		//2nd object for name & age
		Defaultcon d2=new Defaultcon();
		d .show();
		d2.show();
		Defaultcon d3=new Defaultcon();
		d3 .age=100;
		d3 .name="JAVA";
		System.out.println(d3.age+d3.name);
	}
		
	}
	


