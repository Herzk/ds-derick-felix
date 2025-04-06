public class Ex14{
    public static void main(String[] args){
        int F = 0; int aux1 = 0; int aux2 = 1; int  i = 0;
        System.out.print(aux1+"; ");
        System.out.print(aux2+"; ");
        while(i < 1){
            F = aux1+aux2;
            aux1 = aux2;
            aux2 = F;
            if(F > 500){
                i++;
            }else{
                System.out.print(F+"; ");
            }
        }
    }
}