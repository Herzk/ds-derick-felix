import java.util.Scanner;
public class Ex8{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int i = 0;
        System.out.print("Insira um número inteiro maior que 0: ");
            int n = read.nextInt();
        for(i = 1; i<= n; i++){
            System.out.print(i+"; ");
        }

        read.close();
    }
}