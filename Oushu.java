/*
 * 每个偶数都可以由两个素数相加
 */

import java.util.Scanner;

public class Oushu {	
	int  flag=1;
	
	public static void main(String[] args) {
		Oushu os=new Oushu();
		System.out.println("请输入一个偶数");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++){
			if(os.fc(i)==1&&os.fc(n-i)==1){//若i和n-i都是素数，则输出
				System.out.println(i+"+"+(n-i));
			}
		}
	}
	//判断i和n-i是否为素数
	int  fc(int n){
		if(n==3){
			flag=1;
		}
		for(int i=2;i<=n/2;i++){
			if((n%i==0)){
				flag=0;
				break;
			}else{
				flag=1;
			}	
		}
		return flag;
	}
}
