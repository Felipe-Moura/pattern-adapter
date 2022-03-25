package generator;

import java.util.ArrayList;
import java.util.List;

public class CrescentGenerator implements Generator {
	
	private List<Integer> sequenci = new ArrayList<Integer>();
	private int maxValue;
	
	public CrescentGenerator(int maxValue) {
		
		this.maxValue = maxValue;
		generate(maxValue);
		
	}

	@Override
	public void generate(int maxValue) {
		
		for(int i = 0; i < maxValue; i++) {
			sequenci.add(i);
		}
		
	}

	@Override
	public List<Integer> getSequenci() {
		return sequenci;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	

}
