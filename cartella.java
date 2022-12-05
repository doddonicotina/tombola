package tombola;
import java.util.*;
public class Cartella {
	
	int [][] cartella = new int [3][9];
	Random rand = new Random();
	int []numeri=new int[15];
	int contatore=0;
	
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
				int num = 0;
					if(vet[j]==0){
						do 
						{
							num=rand.nextInt(1,9);
						}while (contains(numeri, num));
						
						cartella[i][vet[j]]=num;
						numeri[contatore]=num;
						contatore++;
						}
					else 
					{
						do 
						{
							num=rand.nextInt(vet[j]*10, vet[j]*10+9);
						}while (contains(numeri, num));
						
						cartella[i][vet[j]]=num;
						numeri[contatore]=num;
						contatore++;
					}
					
			}
		
		}
		
	}
	
	public int[] sceltaBuchi()
	{
		int [] vet = new int[5];
		for (int i=0; i<vet.length;i++)
		{
			vet[i]=-1;
		}
		int var=0;
		for (int i=0; i<vet.length;i++)
		{
			do {
				var= rand.nextInt(9);
			}while (contains(vet, var));
			vet[i]=var;
		}
		
		return vet;
	}
	
	public void print()
	{
        for (int i = 0; i < cartella.length; i++) {
        	
        	
        	System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
            for (int j = 0; j < cartella[i].length; j++)
            {
            	System.out.printf("|");
                System.out.printf(cartella[i][j] + "\t");
            } 
            System.out.println("|");
	}
        System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
        }
	
	public boolean contains(int vet[],int rand)
	{
		for (int i=0;i<vet.length;i++)
		{
			 if (vet[i] == rand)
			 {
				 return true;
			 }
		}
		return false;
	}
}
 

