import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
List<Integer> list1 = new ArrayList<Integer>();
List<Integer> list2 = new ArrayList<Integer>();
int index = 0;
for(int i = 0; i < arr2.length; i++) {
	for(int j = 0; j < arr1.length; j++) {
		if(arr2[i] == arr1[j])
			result[index++] = arr2[i];        		
	}        	
}

for(int i = 0; i < arr1.length;i++) {        	
	list1.add(arr1[i]);
}

for(int i = 0; i < arr2.length;i++) {        	
	list2.add(arr2[i]);
}

Collections.sort(list1);

for(int i = 0; i < list1.size(); i++) {
	if(!list2.contains(list1.get(i))) {
		result[index++] = list1.get(i);
	}
}
return result;
	}
}
