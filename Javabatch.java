//3 ways to initialize object in java - By refrence variable , By method, By constroctor
public class Javabatch {
	//instance variable
	int id;
	String Bname;
	public static void main(String[] args) {
		Javabatch jb= new Javabatch();
		Javabatch jb1=new Javabatch();
		jb.id=1;
		jb.Bname="C4119";
		jb1.id=2;
		jb1.Bname="C2";
	    System.out.println(jb.id+" "+jb.Bname);
	    System.out.println(jb1.id+" "+jb1.Bname);
	
	}
}
