package kajol.com;
class MLIParenteg3{ // parent class
	int salary =30000; // parent class member
}
class MIChildEg1 extends MLIParenteg3 {
	int bonus= 1500; // child clas member
	int annualsal= salary+ bonus;
	
}
class MIChildEg2 extends MIChildEg1 {
	int da = 200;
	int totalsal = annualsal+da;
	
	public static void main(String[] args) {
	MIChildEg2 object = new MIChildEg2();
	System.out.println("Salaray is;"+ object.salary);
	System.out.println("Annual Salary is:"+ object.annualsal);
	System.out.println("Total Salary is:"+ object.totalsal);
	}}


 


