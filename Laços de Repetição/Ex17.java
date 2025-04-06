import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o tamanho do conjunto N: ");
        int tamanho = read.nextInt();
        
        System.out.print("Insira n"+tamanho+": ");
        int aux = read.nextInt();
        while(aux > 1000 || aux < 0){
            System.out.print("Valor Inválido!\nInsira n"+tamanho+": ");
            aux = read.nextInt();
        }
        int somaDosValores = aux; int maiorValor = somaDosValores; int menorValor = somaDosValores;
        for(tamanho = tamanho-1; tamanho >= 1; tamanho--){
            System.out.print("Insira n"+tamanho+": ");
            aux = read.nextInt();
            while(aux > 1000 || aux < 0){
                System.out.print("Valor Inválido!\nInsira n"+tamanho+": ");
                aux = read.nextInt();
            }

            if(aux > maiorValor){
                maiorValor = aux;
            }
            if(aux < menorValor){
                menorValor = aux;
            }
            somaDosValores = somaDosValores+aux;
        }
        
        System.out.print("Maior valor: "+maiorValor+"\nMenor Valor: "+menorValor+"\nSoma dos Valores: "+somaDosValores);

        read.close();
    }
}
