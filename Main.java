import java.util.List;
import java.util.Scanner;

import generator.CrescentGenerator;

public class Main {

	public static void main(String[] args) {
		
		int size;
		
		CrescentGenerator crescent;
		Adapter adapterAleatory;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inform the list size: ");
		size = input.nextInt();
		
		crescent = new CrescentGenerator(size);
		adapterAleatory = new Adapter(size);

		printCrescentList(crescent.getSequenci());
		printCrescentList(adapterAleatory.getSequenci());
		
	}
	
	public static void printCrescentList(List<Integer> list) {
		
		int aux = 0;
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			
			if(i == 0) {
				aux = list.get(i);
				System.out.print(aux + " ");
			}
			else if(aux < list.get(i)) {
				aux = list.get(i);
				System.out.print(aux + " ");
			}
				
		}
	}

}
