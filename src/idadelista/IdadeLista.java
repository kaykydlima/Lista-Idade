
package idadelista;


public class IdadeLista {


    public static void main(String[] args) {
        String[] nomes = new String[4];
        
        nomes[0] = "Beatriz tem 18 anos";        
        nomes[1] = "Adriano tem 19 anos";        
        nomes[2] = "Raul tem 20 anos";        
        nomes[3] = "Bruna tem 21 anos";
        
        for(int i = 0; i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
    
}
