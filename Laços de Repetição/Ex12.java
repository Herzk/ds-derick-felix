public class Ex12{
    public static void main(String[] args){
        int i = 0; double paisA = 80000; double paisB = 200000;

        System.out.println("População país A no ano 0: "+paisA);
        System.out.println("População país B no ano 0: "+paisB+"\n");
        while(paisB > paisA){
            i++;
            paisA = paisA + (paisA * 0.03);
            paisB = paisB + (paisB * 0.015);
            System.out.println("População país A no ano "+i+": "+paisA);
            System.out.println("População país B no ano "+i+": "+paisB+"\n");
        }

        System.out.print("O número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B é: "+i);
    }
}