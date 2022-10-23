package ds.sorter;
import java.util.Arrays;
import java.util.List;

public class SelectionSorter<E extends Comparable<E>> implements Sorter<E> {
	

	
	@Override
	public List<E> sort(List<E> input) {
		
		//get the size of list parameter
		int len = input.size();
		
		
		//create Integer type array 
		Integer[] newarr = new Integer[len];
		

		//loop to add values to the array
		for (int i = 0;i<len-1;i++) {
			newarr[i] = (Integer) input.get(i);
		}
		
		//loop to find int value that should be in each element
		for (int i = 0;i<newarr.length;i++) {
			//store minimum value as the first value
			int min =i;
			//look through the unsorted array
			for (int k = i +1;i<newarr.length;k++) {
				
				if(newarr[k] < (newarr[min] )) {
					min = k;
				}
			
			//swap values when a higher value is found.	
			int temp = newarr[i];
			newarr[i] = newarr[min];
			newarr[min] = temp;
			}
			
			
		}
		
		List<Integer> targetList = Arrays.asList(newarr);
	
		return (List<E>) targetList;
   	}

	
}
