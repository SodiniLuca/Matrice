public class Matrice{
    public static void main(String[] args){
        
        // Costanti di gestione di righe e colonne
        final int righe = 10;
        final int colonne = 10;

        // Creazione della matrice
        int [][] m = new int [righe][colonne];

        // Popoliamo la matrice con valori (in questo caso si usano i valori di pitagora)
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = (i + 1) * (j + 1);
            } 
        }

        // Stampiamo il contenuto della matrice
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.printf("%4d" , m[i][j]);
            } 
            System.out.println(); 
        }
    }






}