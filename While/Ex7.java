import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o tamanho do lado do quadrado: ");
        int lado = read.nextInt(); int i = 1; int j = 1;

        while(j <= lado) {
            while(i <= lado){
                System.out.print("*");
                i++;
            }
            i = 1; j++; System.out.println();
        }
        read.close();
    }
}