class Solution {
	void setRowColumnZeroes(int[][] matrix){
	    
		int [] [] shadowMatrix = new int [matrix.length][matrix[0].length];
		
		for(int i=0; i<matrix.length; i++){
			
			for(int j=0; j<matrix[0].length; j++){
				
				shadowMatrix[i][j] = matrix[i][j];				
			}		
		}
		
		for(int i=0; i<matrix.length; i++){
			
			for(int j=0; j<matrix[0].length ;j++){
				
				if(shadowMatrix[i][j] == 0){
					
						for(int k=0; k<matrix[0].length; k++){
							
							matrix[i][k] = 0;						
						}
					
						for(int l=0; l<matrix.length; l++){
							
							matrix[l][j] = 0;						
						}				
				} //end of if loop	
			} //end of jth for loop
		} //end of ith for loop		
	}
}
