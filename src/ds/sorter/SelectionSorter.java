package ds.sorter;

import java.util.ArrayList;
import java.util.List;

public class SelectionSorter<E extends Comparable<E>> implements Sorter<E> {
	

	
	@Override
	public List<E> sort(List<E> input) {
		
		String[] arr = new String[input.size()];
		
		for (int i = 0;i<input.size();i++) {
			arr[i] = (String) input.get(i);
		}
		
		
	
		int len = arr.length;
		
		//move through the unsorted list one by one
		for (int i = 0;i<len-1;i++) {
			
			//minimum value of the unsorted list
			int min = i;
			
			for (int j = i+1;j<len ;j++) {
				if(arr[i] < arr[min]) {
					
					min = j;
				}
					
			E temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
					
				
			}
			
			
		}
		
		return null;
   	}

}
