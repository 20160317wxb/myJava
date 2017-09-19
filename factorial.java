/*
 * 1!+2!+3!+4!+5!+6!+7!+8!+9!+10!
 */

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		System.out.println("请输入一个数字");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++){
			int b=1;
			for(int j=1;j<=i;j++){
				b*=j;
			}
			sum+=b;
			if(i!=a){
				System.out.print(i+"!+");
			}else{
				System.out.println(i+"!="+sum);
			}
		}
	}
}
