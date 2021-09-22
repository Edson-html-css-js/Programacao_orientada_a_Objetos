import java.util.Scanner;
public class ex5 {

		public static void main(String args[]){

	System.out.println("calculadora de area de circulo");
	System.out.println("Digite o raio do circulo");
			Scanner input = new Scanner(System.in);
			double raio = input.nextDouble();
			double PI = 3.1415926;
			double area = raio * raio * PI;

			System.out.println("Area do circulo ==> " + area);

			input.close();	
    }
}
