
package programamedia;
import java.util.Scanner;

public class ProgramaMedia {

    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in); // objeto tec do tipo Scanner;
        System.out.print("Primeira nota: ");
        float n1 = tec.nextFloat(); // pegando primeira nota;
        System.out.println("================");
        System.out.print("Segunda nota: ");
        float n2 = tec.nextFloat(); // pegando segunda nota;
        System.out.println("================");
        float m = (n1+n2)/2;
        System.out.format("Média: %.2f\n",m);
        
        if (m>9){ // se média maior que 9;
            System.out.println("Parabéns!");
        }
    }
    
}
