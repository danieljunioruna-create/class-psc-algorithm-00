import java.util.Scanner;
public class Sala
{
	public static void main(String[] args) {
		String salaDesejada="A219";
		String salaInformada="";
	 Scanner Scanner = new Scanner (System.in);
	
		System.out.print("digite o numero da sala:");
		salaInformada = Scanner.next();
		
		
		
		if (salaDesejada.equals(salaInformada)){
		    System.out.print("Voce encontrou a sala");
		   }else{
		       System.out.print("voce esta perdido! \nSe encontre \n");
		   }
		Scanner.close();
		
		
		
		
		
	}
}