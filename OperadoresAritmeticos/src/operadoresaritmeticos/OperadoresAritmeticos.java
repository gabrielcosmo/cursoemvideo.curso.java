
package operadoresaritmeticos;


public class OperadoresAritmeticos {

    public static void main(String[] args) {
        /**int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);**/
        
        /**int numero = 5;
        int valor = 4 + numero++; -> pos-incremento: soma apos o uso da variavel
        int valor = 4 + ++numero; -> pre-incremento: soma antes do uso da variaval
        System.out.println(valor);  
        System.out.println(numero);**/
        
        float v = 8.3f;
        //double ar = Math.ceil(v); para cima
        // double ar = Math.floor(v); para baixo
        double ar = Math.round(v); // arredonda normal
        System.out.println(ar);
    }
    
}
