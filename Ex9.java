import java.util.Scanner;
public class Ex9{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int i = 0; int n = 0;
        while(i < 1){
            System.out.print("Insira um número inteiro maior que 0: ");
            n = read.nextInt();
            if(n > 0){
                i++;
            } else{
                System.out.println("VALOR INVÁLIDO");
            }
        }
        for(i = 1; i<= n; i++){
            System.out.print(i+"; ");
        }

        read.close();
    }
}