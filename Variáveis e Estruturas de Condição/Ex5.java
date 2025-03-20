import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int x = read.nextInt();
        System.out.print("Insira outro número: ");
        int y = read.nextInt();
        
        int a = x;
        x = y;
        y = a;

        System.out.print("\n" + x + " ; " + y);
        
        read.close();
    }
}
