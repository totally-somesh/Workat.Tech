class Solution {
	int getIdenticalTwinsCount (int[] arr) {
		
		int counter = 0;
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[i] == arr[j])
					counter++;				
			}			
		}
		return counter;		
	}
}
