package tombola;
import java.util.*;
public class Cartella {
	
	int [][] cartella = new int [3][9];
	Random rand = new Random();
	
	public Cartella() 
	{
		for (int i = 0; i<3; i++)
		{
			for (int j = 0; j<9; j++)
			{
				cartella[i][j]=0;
			}
		}
		
		for (int i = 0; i<3; i++)
		{
			int [] vet = sceltaBuchi();
			for (int j = 0; j<vet.length; j++)
			{
				cartella[i][vet[j]]=rand.nextInt(vet[j]*10, vet[j]*10+9);
			}
		}
		
	}
	
	public int[] sceltaBuchi()
	{
		int [] vet = new int[5];
		
		for (int i=0; i<vet.length;i++)
		{
			//aggiungere controllo
			vet[i] = rand.nextInt(9);
		}
		return vet;
	}
	
	public void print()
	{
        for (int i = 0; i < cartella.length; i++) {
        	System.out.println();
     
            for (int j = 0; j < cartella[i].length; j++)
                System.out.print(cartella[i][j] + " ");
	}}
}
 

