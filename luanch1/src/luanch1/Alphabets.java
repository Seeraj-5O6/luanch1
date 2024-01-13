package luanch1;

public class Alphabets {

	public static void main(String[] args) {

int i,j,n=8;
	    
	    for(i=0;i<n;i++){
	        
	        
	          for(j=0;j<n;j++){
	            
	            
	   if(( i==0 && j<=(3*n)/4) ||(  j==0  && i<=(n-1)/2)  ||(i==(n-1)/2 && j<(3*n)/4) ||(i==(n-1) && j<=(3*n)/4) ||(  j==(3*n)/4  && i>=(n-1)/2) ){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	        
	        for(j=0;j<n;j++){
	            
	            
	   if((i==0  && j<=(n-1)/2) ||(j==0  && i<=n-1) || (i==(n-1)/2 && j<=(n-1)/2) || (i==n-1 && j<=(n-1)/2)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	              for(j=0;j<n;j++){
	            
	            
	   if((i==0  && j<=(n-1)/2) ||(j==0  && i<=n-1) || (i==(n-1)/2 && j<=(n-1)/2) || (i==n-1 && j<=(n-1)/2)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	             
	                for(j=0;j<n;j++){
	            
	            
	   if((i==0  && j<(3*n)/4) ||(j==0  && i<=n-1) ||(i>0 && j==(3*n)/4 && i<(n-1)/2) ||(i==(n-1)/2 && j<(3*n)/4) || i-j==(n-1)/2){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	              for(j=0;j<n;j++){
	            
	            
	   if((j>0 &&i==0 && j<(3*n)/4) ||( i>0 && j==0  && i<=n-1) ||(i>0 && j==(3*n)/4) ||(i==(n-1)/2 && j<(3*n)/4)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	             
	              
	        for(j=0;j<n;j++){
	            
	            
	   if((i==0 && j<(3*n)/4) ||(j==n/4 && i<n-1) || ( i>0 && i==n-1 && j<n/4)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	           
	       
	             
	             
	       System.out.println();
	      
	        
	        
	       
	            
	 } 
	   
	    	for(i=0;i<n;i++) {
			
			for(j=0;j<n;j++) {
				
				
				if(( i==0 && j<=(3*n)/4) ||(  j==0  && i<=(n-1)/2)  ||(i==(n-1)/2 && j<(3*n)/4) ||(i==(n-1) && j<=(3*n)/4) ||(  j==(3*n)/4  && i>=(n-1)/2)) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			
			  for(j=0;j<n;j++){
	            
	            
	   if((j>0 &&i==0 && j<(3*n)/4) ||( i>0 && j==0  && i<=n-1) ||(i>0 && j==(3*n)/4) ||(i==(n-1)/2 && j<(3*n)/4)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	             
	             
	             	for(j=0;j<n;j++) {
				
				
				if(( i==0 && j<=(3*n)/4)    ||(i==(n-1) && j<=(3*n)/4) ||(j==n/4 )) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			
				for(j=0;j<n;j++) {
				
				
				if(( i==0 && j<=(3*n)/4)||(j==n/4 )) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			 for(j=0;j<n;j++){
	            
	            
	   if((i==0  && j<=(n-1)/2) ||(j==0  && i<=n-1) || (i==(n-1)/2 && j<=(n-1)/2) || (i==n-1 && j<=(n-1)/2)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
			 
			 
			   for(j=0;j<n;j++){
	            
	            
	   if((i==0 && j<(3*n)/4) ||(j==n/4 && i<n-1) || ( i>0 && i==n-1 && j<n/4)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	             
	             
	               for(j=0;j<n;j++){
	            
	            
	   if((j>0 &&i==0 && j<(3*n)/4) ||( i>0 && j==0  && i<=n-1) ||(i>0 && j==(3*n)/4) ||(i==(n-1)/2 && j<(3*n)/4)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	             
			
			System.out.println();
			
		}


	    	for(i=0;i<n;i++) {
			
			for(j=0;j<n;j++) {
				
				
				if(( i==0 && j<=(3*n)/4) ||(  j==0  && i<=(n-1)/2)  ||(i==(n-1)/2 && j<(3*n)/4) ||(i==(n-1) && j<=(3*n)/4) ||(  j==(3*n)/4  && i>=(n-1)/2) ) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			
				for(j=0;j<n;j++) {
				
				
				if((j==0 && i>0)  ||( j>0 && i==(n-1) && j<(3*n)/4) || (j==(3*n)/4 && i>0)) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			
			
	                for(j=0;j<n;j++){
	            
	            
	   if((i==0  && j<(3*n)/4) ||(j==0  && i<=n-1) ||(i>0 && j==(3*n)/4 && i<(n-1)/2) ||(i==(n-1)/2 && j<(3*n)/4) || i-j==(n-1)/2){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
	             
	             
	             	for(j=0;j<n;j++) {
				
				
				if(i==j && i<n/2 && j<n/2 || i+j==n-1) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			
			 
	               for(j=0;j<n;j++){
	            
	            
	   if((j>0 &&i==0 && j<(3*n)/4) ||( i>0 && j==0  && i<=n-1) ||(i>0 && j==(3*n)/4) ||(i==(n-1)/2 && j<(3*n)/4)){
	                
	          	System.out.print("*"); }
	          	
	          	else{
	          	    System.out.print(" ");
	          	    }
	          	
	             }
			
			
			
			System.out.println();
		}
	}

}
