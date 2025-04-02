import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int i = 0; double n1 = 0; double n2 = 0;
        System.out.print("Insira o valor da primeira nota: ");
            n1 = read.nextDouble();
            if(n1 >= 0 && n1 <= 10){
                i++;
            }
        while(i < 1){
            System.out.print("VALOR INVÁLIDO\nInsira o valor da primeira nota: ");
            n1 = read.nextDouble();
            if(n1 >= 0 && n1 <= 10){
                i++;
            }
        }
        i = 0;
        System.out.print("Insira o valor da segunda nota: ");
            n2 = read.nextDouble();
            if(n2 >= 0 && n2 <= 10){
                i++;
            }
        while(i < 1){
            System.out.print("VALOR INVÁLIDO\nInsira o valor da segunda nota: ");
            n2 = read.nextDouble();
            if(n2 >= 0 && n2 <= 10){
                i++;
            }
        }
        double div = n1/n2;
        System.out.print("\nA média das notas é "+div);

        read.close();
    }
}
