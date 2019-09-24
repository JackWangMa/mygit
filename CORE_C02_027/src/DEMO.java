
public class DEMO {

	public static void main(String[] args) {
		int sum,n,j;
		sum=0;j=1;
		/*for(int k=1;k<=100;k++){
			n=k%10;
			if(n==3){
				sum=sum+k;
				
				
			}
			else{
				continue;
				
			}
			
			
		}
		*/
	  while(j<=100){
			n=j%10;
			if(n==3){
				sum=sum+j;
				j++;
			}
			else
			{  j++;
				continue;
				
			}
			
		}
		System.out.println("sum="+sum);
		
	}

}
