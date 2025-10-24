import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
    
        System.out.print("Insira a sua idade:\nAnos: ");
        int years = read.nextInt();
        System.out.print("Meses: ");
        int months = read.nextInt();
        System.out.print("Dias: ");
        int days = read.nextInt();

        int ageInDays = (years*365)+(months*30)+days;

        System.out.print("\nSua idade em dias é: "+ageInDays);

        read.close();
    }
}