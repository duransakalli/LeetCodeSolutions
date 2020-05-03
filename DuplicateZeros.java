
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
        	if(arr[i] == 0) {
        		int j = arr.length-2;
        		while(j >= i) {
        			arr[j+1] = arr[j];
        			j--;
        		}
        		i++;
        	}
        }
    }
}
