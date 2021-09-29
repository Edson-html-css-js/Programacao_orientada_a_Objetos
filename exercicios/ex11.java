import java.util.Scanner;


public class ex11 { 

    public static void main(String args[]) { 

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = scan.nextInt();
        
        int lista = [];
        int par = 0;
        int impar = 0;
        for (int i=0; i < lista.length; i++)
        {
        if ( lista[i] % 2 == 0)
        {
        par = par + lista[i];
        }
        else
        {
        impar = impar + lista[i];
        }
        }

        System.out.println("impar = " + impar);
        System.out.println("par = " + par);

    
    }

}