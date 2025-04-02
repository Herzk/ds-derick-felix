import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int i = 0; double n1 = 0; double n2 = 0;

        System.out.print("Insira o primeiro número: ");
        n1 = read.nextDouble();

        while(i < 1){
            System.out.print("Insira o segundo número: ");
            n2 = read.nextDouble();
            if(n2 > 0){
                i++;
            }
        }
        
        double div = n1/n2;
        System.out.print("\nA divisão do primeiro pelo segundo é "+div);

        read.close();
    }
}
