import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o tamanho do lado do quadrado: ");
        int lado = read.nextInt(); int i = 1; int j = 1;

        
        while(i <= lado){
            System.out.print("*");
            i++;
        }
        i = 1;
        System.out.println();
        while(i <= lado-2){
            System.out.print("*");
            while(j <= lado-2){
                System.out.print(" ");
                j++;
            }
            System.out.print("*");
            System.out.println();
            j = 1; i++;
        }
        i = 1;
        while(i <= lado){
            System.out.print("*");
            i++;
        }
        read.close();
    }
}