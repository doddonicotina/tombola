package tombola;

public class Tombolone {
	int [][] cartella = new int [9][10];
	
	
	public Tombolone() {
		 for (int i=0 ;i<9; i++) {
			 for (int j=0 ;j<10; j++) {
				 cartella[i][j]=i*10+(1+j);
			 } 
		 }
	}
	public void print()
	{
        for (int i = 0; i < cartella.length; i++) {
        	
        	
        	System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
            for (int j = 0; j < cartella[i].length; j++)
            {
            	System.out.printf("|");
                System.out.printf(cartella[i][j] + "\t");
            } 
            System.out.println("|");
	}
        System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
        }
	
	public void generaNumero() {
		
		
		
	}
}
