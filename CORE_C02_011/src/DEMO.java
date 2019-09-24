import java.util.Scanner;

public class DEMO {

	public static void main(String[] args) {
	int num1,num2;
	 Scanner sc=new Scanner(System.in);
	for(;;){
		 
		System.out.println("输入第一个数字：");
		  num1=sc.nextInt();
		  System.out.println("输入第二个数字：");
			num2=sc.nextInt();
          // sc.close();
			if(num1>=num2){
				System.out.println("输入第一个数字："+num1);
				System.out.println("输入第二个数字："+num2);
				
			}
			else{
				System.out.println("输入第二个数字："+num2);
				System.out.println("输入第一个数字："+num1);
				
			}
			
	}
	 
	}

}
