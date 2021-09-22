import java.util.Scanner;


public class ExpressoesLogicas { 

    public static void main(String args[]) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Teste de Gripe");
        
        System.out.println("Você está tosssindo ? (true/false)");
        boolean tosse = scan.nextBoolean();

        System.out.println("Você está expirrando ? (true/false)");
        boolean espirro = scan.nextBoolean();
// }

 // Tabela de gripe (XOR)
        // tosse   |   espirro   |   gripe
        // true    |   true      |   false
        // false   |   true      |   true
        // true    |   false     |   true
        // false   |   false     |   false

        boolean gripe = tosse ^ espirro;

        System.err.println("Possibilidade de Gripe : " + gripe);

        scan.close();
    }

}