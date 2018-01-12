//Riempimento di una matrice e output matrice traspota - Lupoli Michele
import java.io.*;
public class MatriceTrasposta {
	public static void main(String args[]) 
	{
		//Impostazione dello standard input
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		//Dichiarazione variabili
		int matrice[][];             /* Dichiarazione matrice */
		matrice = new int[3][5];   
		int trasposta[][];
		trasposta = new int[3][5];
		int riga, colonna, i, j;
		
		//Richiesta numero righe
		System.out.print("Quante righe vuoi inserire? (max 3): ");  //Output-Input numero righe della matrice
		try {
			String numeroLetto = tastiera.readLine();
			riga = Integer.valueOf(numeroLetto).intValue();
		}
		catch (Exception e) {
			System.out.println("Numero non corretto! ");
			return;
		}
		
		//Richiesta nuemero colonne
		System.out.print("Quante colonne vuoi inserire? (max 5): ");
		try {
			String numeroLetto = tastiera.readLine();
			colonna = Integer.valueOf(numeroLetto).intValue();
			}
		catch (Exception e) {
			System.out.println("Numero non corretto! ");
			return;
		}
		
		//Inserimento elementi nella matrice
		for (i=0; i<riga; i++)
		{
			for (j=0; j<colonna; j++)
			{
				System.out.print("Inserisci elemento matrice n. "+"["+i+"]"+"["+j+"]: ");
				try {
				String numeroLetto = tastiera.readLine();
				matrice[i][j] = Integer.valueOf(numeroLetto).intValue();
					}
				catch (Exception e) 
				{
				System.out.println("Numero non corretto! ");
				return;
				}
			}
		}
		//Output matrice
		System.out.println("Matrice: ");
		for (i=0; i<riga; i++)
		{
			for (j=0; j<colonna; j++)
			{
				System.out.print(matrice[i][j]+" ");
			}
		}
		System.out.println();
		
		//Calcolo matrice trasposta
		System.out.println("Matrice trasposta: ");
		for (i=0; i<riga; i++)
		{
			for (j=0; j<colonna; j++)
			{
				trasposta[i][j] = matrice[j][i];
				System.out.print(trasposta[i][j] + " ");
			}
		}
	}
}
