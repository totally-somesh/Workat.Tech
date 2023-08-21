class Solution {
	int[] getCumulativeSum (int[] arr) {
		
		int [] cumulativeSum = new int [arr.length];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++){
			 
			sum += arr[i];
			cumulativeSum[i] = sum;	
		}
		
		return cumulativeSum;		
	}
}
