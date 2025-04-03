import java.util.Scanner;
public class Ex4{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        char novoCalculo = 'S';
        do{
            int i = 0; double n1 = 0; double n2 = 0;
            while(i < 1){
                System.out.print("Insira o valor da primeira nota: ");
                n1 = read.nextDouble();
                if(n1 >= 0 && n1 <= 10){
                    i++;
                } else{
                    System.out.println("\nVALOR INVÁLIDO");
                }
            }
            i = 0;
            while(i < 1){
                System.out.print("Insira o valor da segunda nota: ");
                n2 = read.nextDouble();
                if(n2 >=0 && n2 <= 10){
                    i++;
                } else{
                    System.out.println("\nVALOR INVÁLIDO");
                }
            }
            double media = (n1+n2)/2;
            System.out.println("\nA média das notas é "+media);

            i = 0;
            while(i < 1){
                System.out.println("\nNOVO CÁLCULO (S/N)?");
                novoCalculo = read.next().charAt(0);
                if(novoCalculo == 'N' || novoCalculo == 'n' || novoCalculo == 'S' || novoCalculo == 's'){
                    i++;
                } else{
                    System.out.println("\nVALOR INVÁLIDO");
                }
            }
        }
        while(novoCalculo != 'N' && novoCalculo != 'n');

        read.close();
    }
}