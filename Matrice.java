public class Matrice{
    
    /**
     * Popola la matrice con i numeri di Pitagora
     * @param matrice da popolare
     * @return void
     */
    public static void pitagora(int [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = (i + 1) * (j + 1);
            } 
        }
    }

    /**
     * Stampa la matrice
     * @param matrice da popolare
     * @return void
     */
    public static void stampaMatrice(int [][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.printf("%4d" , m[i][j]);
            } 
            System.out.println(); 
        }
    }
    
    public static void main(String[] args){
        
        // Costanti di gestione di righe e colonne
        final int righe = 10;
        final int colonne = 10;

        // Creazione della matrice
        int [][] m = new int [righe][colonne];

        // Popolo la matrice con i numeri di pitagora
        pitagora(m);

        // Stampo il contenuto della matrice
        stampaMatrice(m);

    }
}