public class DesvioCondicionalUmidade { 

    public static void main(String args[]) { 

        int umidade = 87;
        System.out.println("Testa a umidade"+ umidade);

        if(umidade < 70) {
            System.out.println("Está seco");
        }else{
            System.out.println("Esta umido");
        }

    }
}