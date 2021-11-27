import java.util.Scanner;

public class ex29_2 {
 
        Scanner scan = new Scanner(System.in);
        chamado[] chamados = neu chamado[100];
        int indice =0;

        public void cadastrar() {
            System.out.println("Cadastrar novo chamado\n\n");
            chamado c = new chamado();

            System.out.println("informe para qual fila vai esse chamado");
            c.fila =scan.nextLine();
            System.out.println("Descreva um pouco sobre o chamado");
            c.descricao =scan.nextLine();
            System.out.println("informe a prioridade do chamado");
            

        }

}