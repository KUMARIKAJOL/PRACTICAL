package kajol.com;
 class SIParenteg2{// parent class
	 int salary = 30000; // parent class member
 }
public class SIChildeg2 extends SIParenteg2 {
	int bonus=1500;
	int annualsal= salary+bonus;
	public static void main(String[] args) {
		SIChildeg2 object = new SIChildeg2();
		System.out.println("Salary is:"+object);
		System.out.println("Annual Salary is:"+ object.annualsal);
		
	}

}
