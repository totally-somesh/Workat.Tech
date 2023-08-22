class Solution {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
		
		int sum = 0;
		int [] cumulativeArr = new int[arr.length];	
		List<Integer> posCumulativeArrList = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++){
			
			sum += arr[i];
			
			cumulativeArr[i] = sum;			
		}
		
		for(int i=0; i<cumulativeArr.length; i++){
			
			if(cumulativeArr[i] > 0){
				
				posCumulativeArrList.add(cumulativeArr[i]);				
			}			
		}	
		
		return posCumulativeArrList;	
	}
}
