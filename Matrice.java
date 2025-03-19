public class Matrice{
    // Attributi
    int righe;
    int colonne;
    int [][] matrice;

    Matrice(int righe, int colonne){
        this.righe = righe;
        this.colonne = colonne;
        this.matrice = new int [righe][colonne];
    }

    /**
     * Popola la matrice con i numeri di Pitagora
     * @param matrice da popolare
     * @return void
     */
    public void pitagora(){
        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++){
                matrice[i][j] = (i + 1) * (j + 1);
            } 
        }
    }

    /**
     * Stampa la matrice
     * @param matrice da stampare
     * @return void
     */
    public void stampaMatrice(){
        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j < matrice[i].length; j++){
                System.out.printf("%4d" , matrice[i][j]);
            } 
            System.out.println(); 
        }
    }

    /**
     * Stampa la matrice utilizzando lo String Builder
     * @param matrice da stampare
     * @return void
     */
    public void stampaMatriceSB() {
        // Crea la matrice tramite StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                sb.append(String.format("%4d", matrice[i][j]));
            }
            sb.append(System.lineSeparator()); // Aggiungi una nuova linea alla fine di ogni riga
        }
        // Stampa la matrice
        System.out.print(sb.toString());
    }
    
    public static void main(String[] args){
        Matrice m = new Matrice(10,10);

        // Popolo la matrice con i numeri di pitagora
        m.pitagora();

        // Stampo il contenuto della matrice
        m.stampaMatrice();

        // Stampo una linea per dividere le due stampe
        System.out.print("\n");

        // STampo il contenuto della matrice utilizzando lo StringBuilder
        m.stampaMatriceSB();
    }
}