import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n = read.nextInt();
        int antecessorDeN = n-1;
        int sucessorDeN = n+1;
        System.out.print("\nAntecessor: "+antecessorDeN+"\nSucessor: "+sucessorDeN);

        read.close();
    }
}
