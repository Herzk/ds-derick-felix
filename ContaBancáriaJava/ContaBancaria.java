public class ContaBancaria {
    public String Clientes;
    public int num_conta;
    public float saldo;
    
    public static float Sacar(float saldo, float valor){
        if (saldo-valor>=0) {
            System.out.println("Valor do saldo antes do saque: R$"+saldo);
            saldo = saldo-valor;
            System.out.println("Valor do saque: R$"+valor+"\nValor do saldo após saque: R$"+saldo);
            return saldo;
        }
        System.out.println("Valor de saque inválido.");
        return saldo;
    }
    public static float Depositar(float saldo, float valor){
        System.out.println("Valor do saldo antes do depósito: R$"+saldo);
        saldo = saldo+valor;
        System.out.println("Valor do depósito: R$"+valor+"\nValor do saldo após depósito: R$"+saldo);
        return saldo;
    }
    
    public static void main(String[] args){
        float saldo = 100;
        saldo = ContaBancaria.Sacar(saldo, 200);
        saldo = ContaBancaria.Sacar(saldo, 75);
        saldo = ContaBancaria.Depositar(saldo, 100);
    }
}
