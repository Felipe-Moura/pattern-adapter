import java.util.ArrayList;
import java.util.List;

import generator.AleatoryGenerator;
import generator.Generator;

public class Adapter implements Generator{
	
	AleatoryGenerator aleatory;
	int size;
	
	public Adapter(int size) {
		this.size = size;
		generate(size);
	}

	@Override
	public void generate(int maxValue) {
		
		aleatory = new AleatoryGenerator(size);
		
	}

	@Override
	public List<Integer> getSequenci() {
		// TODO Auto-generated method stub
		return selectionSort(aleatory.getAleatoryList());
	}
	
	private List<Integer> selectionSort(List<Integer> input){
		
		List<Integer> output = new ArrayList<Integer>(input);
		int min, aux;
		
		for(int i = 0; i < input.size(); i++) {
			min = i;
			
			for(int j = i + 1; j < input.size(); j++) {
				if(output.get(j) < output.get(min)) {
					min = j;
				}
			}
			
			if(min != i) {
				aux = output.get(i);
				output.set(i, output.get(min));
				output.set(min, aux);
			}
		}
		
		return output;
	}

}
