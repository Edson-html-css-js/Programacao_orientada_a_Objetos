public class TesteOperadorIncremento2 { 

	public static void main(String args[]) {
	
	int a = 10;
	System.out.println("A ==>" + a);

	//int b = a++ + 5; //b ==15
	int b = ++a +5;  //b ==16
	
	System.out.println("A ==>" + a);

	System.out.println("B ==>" + b);



    }

}
