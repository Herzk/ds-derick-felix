import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira um saldo: ");
        double saldo = read.nextDouble();
        double saldoMais1PorCento = saldo + (saldo*0.01);
        System.out.print("\nSaldo com reajuste de + 1%: "+saldoMais1PorCento);

        read.close();
    }
}
