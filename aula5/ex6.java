import java.util.Scanner;
public class ex6 {

		public static void main(String args[]){

	System.out.println("calculadora de area de tri�ngulo");
	System.out.println("Digite o raio do tri�ngulo");
			Scanner input = new Scanner(System.in);
			double raio = input.nextDouble();
			double altura = 1.50;
			double area = raio * altura * 2;

	System.out.println("Area do tri�ngulo ==> " + area);

			input.close();	
    }
}

