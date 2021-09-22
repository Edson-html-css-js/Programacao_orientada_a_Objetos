public class ex8 { 
	public static void main(String [] args) { 

int diaSemana = 3;

	boolean folgaDomingo = diaSemana == 1;
	boolean trabalho = diaSemana != 1   &&   diaSemana != 7;
	boolean descanso = diaSemana == 1  ||  diaSemana == 7;
	boolean irParaFecaf = ! descanso;

System.out.println("Dia da Semana ==> " + diaSemana);
		System.out.println("Dia de Folga de Domingo ==> " + folgaDomingo);
		System.out.println("Dia de Trabalho ==> " + trabalho);
		System.out.println("Dia de Descanso ==> " + descanso);




	}



}



