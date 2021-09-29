

public class testeWhile { 

    public static void main(String args[]) { 

        System.out.println("Pregrama de testes do while");

        int i = 0;//inicialização

        while(i < 20){// condição

            System.out.println(i);//20 vezes?
            i++; //passo

            // if (i == 14){
            //     i++
            //     continue;
            // }


            if(i == 19){
                break;
            }
        }

        System.out.println("Fim do programa");


    }

}

