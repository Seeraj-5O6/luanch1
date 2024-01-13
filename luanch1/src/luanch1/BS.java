package luanch1;

public class BS {

	public static void main(String[] args) {
	

		 
		 
		  int ar[]={20,30,33,36,55,100,400,500,600};
		  int l=0;
		  int mid;
		  int key=55;
		  int h=ar.length-1;
		  
		  while(l<=h){
		      
		      mid=(l+h)/2;
		      
		      
		      if(key==ar[mid]){
		          System.out.print("key is found at index "+mid);
		          break;
		      }
		      else if (key<ar[mid]){
		            
		            h=mid-1;
		      } 
		      else if(key>ar[mid]){
		          l=mid+1;
		      }
		   }
		   
		if(l>h){
		       System.out.print("key is not  found");
		}  
		  

	}

}
