
package contadorwhile;


public class ContadorWhile {

 
    public static void main(String[] args) {
        int cc = 0;
        while(cc<10){
            cc++;        // pós-encremento;
            if (cc==5){
                // continue -> ignora o resto da exução do laço e retorn ao começo;
                // break -> interrompe o laço;
                // break;
                continue; 
            }
            System.out.println("-----------------");
            System.out.println("|Canbalhota " + cc + "...|");
            System.out.println("-----------------");
            
        }
        System.out.println("Fim.");
    }   
}
