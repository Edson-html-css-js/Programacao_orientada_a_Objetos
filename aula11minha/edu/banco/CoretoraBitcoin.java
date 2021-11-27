package edu.banco;

public class CoretoraBitcoin {

    

    public String agencia;
    public String cpf;
    public String numeroConta;
    public double limite;
    public double saldoEmCripto;

    public double sacar(double quantia) {
        // int a = 10;
        System.out.println("Saldo anterior ==>" + saldoEmCripto);
        saldoEmCripto = saldoEmCripto - quantia;
        System.out.println("Saque de ==>" + quantia); 
        System.out.println("Saldo atual ==>" + saldoEmCripto);
        // System.out.println(a);
        return(saldoEmCripto);
    }

    public void depositar(double quantia) { 
        
        System.out.println("Saldo anterior ==>" + saldoEmCripto);
        saldoEmCripto = saldoEmCripto + quantia;
        System.out.println("Deposito de ==>" + quantia); 
        System.out.println("Saldo atual ==>" + saldoEmCripto);
    }

    public void mostrarDados() { 
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta Corrente: " + numeroConta);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldoEmCripto);
        System.out.println("Limite: " + limite);
    }
    
}
