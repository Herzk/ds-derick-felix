import java.util.Scanner;
public class Ex5{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int i = 1; int n = 0;
        while(i <= 10){
            System.out.print("Insira n"+i+": ");
            int aux = read.nextInt();
            if(aux > n){
                n = aux;
            }
            i++;
        }
        System.out.print("O maior número dentre os inseridos é "+n);
    }
}