
package programaidade;
import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Seu Ano de Nascimento: ");
        int nasc = tec.nextInt();       
        System.out.println("======================");
        int i = 2020-nasc;
        System.out.println("Sua idades é "+i);
        System.out.println("======================");
        if (i>=18){
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade");
        }
        
    }
    
}
