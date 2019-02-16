class Binaria1 {

      public int getTimes(int [] array, int k){

      	int start = 0; 
      	int end = array.length-1;
      	
      	while(start < end){
      		
      		int mid = start + (end-start)/2;
      		
      		if(array[mid] < k){
      			start = mid+1;
      		}else{
      			end = mid;
      		}	
      		
      	} 
	
		if(array[end] != k)
			return 0;
			
		int first = end;
		
		end = array.length-1;
		
		while(start<end){
			
			int mid = start + (end-start+1)/2;
			
			if(array[mid] > k){
				end = mid-1;
			}else{
				start = mid;
			}
		}
		
		return end - first+1;
      }


}