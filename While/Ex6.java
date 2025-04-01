import java.util.Scanner;
public class Ex6{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int i = 1; int primeiroMaior = 0; int segundoMaior = 0;
        while(i <= 10){
            System.out.print("Insira n"+i+": ");
            int aux = read.nextInt();
            if(aux > primeiroMaior){
                primeiroMaior = aux;
            } else if(aux > segundoMaior){
                segundoMaior = aux;
            }
            i++;
        }
        System.out.print("O maior número dentre os inseridos é o "+primeiroMaior+" e o segundo maior é o "+segundoMaior);
    }
}