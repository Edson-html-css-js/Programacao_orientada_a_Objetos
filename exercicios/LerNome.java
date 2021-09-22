import java.util.Scanner;

public class LerNome {
            public static void main(String[] args) {

            

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite seu nome");
            String nome = entrada.nextLine();
            


            System.out.println("Digite seu sobrenome");
            
            String sobrenome = entrada.nextLine();
            
            
        
            System.out.println(" Seu nome é " + nome + "  e seu sobrenome é  " + sobrenome);
       
            entrada.close();
        
       }
}
