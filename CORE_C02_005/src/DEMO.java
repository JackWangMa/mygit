
public class DEMO {

	public static void main(String[] args) {
		
		 System.out.println("��10000�׵ĸ߶���������Զ��������10�η���");
		 calcator(10000,10);
		

	}
   public static  void calcator(int height ,int n){
	    int i;
	    int h1=0;int h2=0;int h3=height;
	    for(i=0;i<n;i++){
	    	height=height/2;
	    	//h1=h1+height;
	    	if(i==n-1){
	    		//h2=h1*2+h3;
	    	    h3=height;
	    	}
	    	
	    }
	   System.out.println("������"+n+"�εķ�����"+"�����ĸ߶�Ϊ��"+h3);
	   
	   
   }

}
