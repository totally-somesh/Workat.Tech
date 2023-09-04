class Solution {
	List<Integer> primesUptoN(int n) {
	  
		int count = 0;
		
		ArrayList<Integer> arrList = new ArrayList<>();		
		
		for(int i=2; i<=n; i++){
			
			count = 0;
			
			for(int j=1; j<=i; j++){
			
				if(i % j == 0){	
					
					count++;
					if(count > 2){
						
						break;
					}
				}						
			}
			
			if(count == 2){
					
					arrList.add(i);				
				}
		}
		
		return arrList;	
	}
}
