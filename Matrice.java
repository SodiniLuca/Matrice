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
     * @param matrice da stampare
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

    /**
     * Stampa la matrice utilizzando lo String Builder
     * @param matrice da stampare
     * @return void
     */
    public static void stampaMatriceSB(int [][] m) {
        // Crea la matrice tramite StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sb.append(String.format("%4d", m[i][j]));
            }
            sb.append(System.lineSeparator()); // Aggiungi una nuova linea alla fine di ogni riga
        }
        // Stampa la matrice
        System.out.print(sb.toString());
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
        System.out.print("\n");
        stampaMatriceSB(m);
    }
}