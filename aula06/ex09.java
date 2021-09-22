import java.util.Scanner;


public class ex09 { 

    public static void main(String args[]) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Teste de Gravides");
        
        System.out.println("Você está com enjouo ? (true/false)");
        boolean enjouo = scan.nextBoolean();

        System.out.println("Você está vomitando ? (true/false)");
        boolean vomitando = scan.nextBoolean();
 }

    
        boolean gravida = enjouo ^ vomitando;

        System.err.println("Possibilidade de Gravides : " + gravida);

        scan.close();
    )

}