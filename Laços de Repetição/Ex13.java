import java.util.Scanner;
public class Ex13{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int F = 0; int n = 0; int i = 0; int aux1 = 0; int aux2 = 1;
        while(i < 1){
            System.out.print("Insira um número inteiro maior que 0: ");
            n = read.nextInt();
            if(n > 0){
                i++;
            } else{
                System.out.println("VALOR INVÁLIDO");
            }
        }
        System.out.print(aux1+"; ");
        System.out.print(aux2+"; ");
        for(i = 1; i<= (n-2); i++){
            F = aux1+aux2;
            aux1 = aux2;
            aux2 = F;
            System.out.print(F+"; ");
        }

        read.close();
    }
}