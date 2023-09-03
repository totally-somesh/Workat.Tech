class Solution {
	int largestContiguousSum(int[] arr){
		
		int maxSum = Integer.MIN_VALUE;
		
		int sum = 0;
				
		for(int num : arr){

			sum = Math.max(num, sum + num);
			maxSum = Math.max(sum, maxSum);			
		}
		
		return maxSum;	
	}
}
