import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o número natural que deseja calcular o fatorial: ");
        int n = read.nextInt(); int fatorial = 1;

        while(n > 0 ){
            fatorial = fatorial * n;
            n--;
        }

        System.out.print("Fatorial do número inserido: "+fatorial);

        read.close();
    }
}
