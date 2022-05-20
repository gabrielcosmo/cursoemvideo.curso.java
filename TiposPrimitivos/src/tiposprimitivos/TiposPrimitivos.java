
package tiposprimitivos;
import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); // entrada de uma string
        
        System.out.print("Digite a nota do aluno: "); 
        float nota = teclado.nextFloat(); // entrada de um float
        
//System.out.println("A nota é " + nota);  -> print com quebra de linha;
//System.out.printf("A nota é %.2f \n", nota); -> print formatado;
        System.out.format("A nota de %s é %.1f \n", nome, nota); // -> print formatado;
    }
    
}
