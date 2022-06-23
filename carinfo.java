package week1.day1;
import week1.day1.calculator;
public class carinfo {

	public void printCarNAme()
	{
System.out.println("Baleno");
	}
	private String getCarColor()
	{
		String color="Blue";
return color;
	}
	Boolean carPuncture()
	{
	return false;
	}

public static void main(String[] args) {
	carinfo obj=new carinfo();
	obj.printCarNAme();
	System.out.println(obj.getCarColor());
	System.out.println(obj.carPuncture());
	
	calculator obj1=new calculator();
	int add=obj1.addTwonumbers(5, 9);
	System.out.println(add);
int div=obj1.divTwonumbers(100, 5);	
System.out.println(div);


	
}
}
