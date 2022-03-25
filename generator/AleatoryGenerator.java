package generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AleatoryGenerator {
	
	private List<Integer> aleatory = new ArrayList<Integer>();
	private int listSize;
	
	public AleatoryGenerator(int size) {
		this.listSize = size;
		randomGenerator(size);
	}
	
	public void randomGenerator(int size){
		
		Random rnd = new Random();
		
		for(int i = 0; i < size; i++) {
			aleatory.add(rnd.nextInt(100));
		}
	}
	
	public List<Integer> getAleatoryList(){
		return aleatory;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	
	

}
